package com.qa.requestspecifications;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.util.ConfigReader;

public class ApiUtils {

    // Instance variables to hold the request specification and necessary fields.
    private RequestSpecification requestSpecification;
    private String configPath;
    private Properties prop;
    private Response response;

    private final Logger logger = Logger.getLogger(ApiUtils.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Constructor to initialize the config path.
    public ApiUtils() {
        this.configPath = System.getProperty("user.dir") + "//src//test//resources//Config//Config.properties";
        this.requestSpecification = RestAssured.given(); 
    }

    /**
     * Retrieves the base URI for a specified API based on the execution environment.
     *
     * @param apiName The name of the API to get the base URI for.
     * @return The base URI as a String if found; otherwise, returns null.
     */
    public String getUrl(String apiName) {
        ConfigReader configReader = new ConfigReader();
        String baseUriUpd = "";

        try {
            prop = configReader.init_prop(configPath);
            String env = prop.getProperty("ExecutionEnvironment");

            // Construct the base URI based on the environment
            String baseUriKey = env.toLowerCase() + "." + apiName.toLowerCase() + ".baseUri";
            baseUriUpd = prop.getProperty(baseUriKey);

            if (baseUriUpd == null || baseUriUpd.isEmpty()) {
                logger.error("Incorrect Base URI given for key: " + baseUriKey);
            } else {
                logger.info("Base URI for " + apiName + " is: " + baseUriUpd);
            }
        } catch (Exception e) {
            logger.error("Unable to get BaseUri from Config: " + e.getMessage());
        }
        return baseUriUpd; 
    }

    /**
     * Sets the base URI for RestAssured based on the specified execution environment.
     *
     * @param baseUri The API name to get the appropriate baseUri from the Config file.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils setBaseUri(String baseUri) {
        //RestAssured.baseURI = getUrl(baseUri);
    	String bsUrl=getUrl(baseUri);
        requestSpecification.baseUri(bsUrl);
        logger.info("Base URI set to: " + bsUrl);
        return this;
    }

    /**
     * Sets the base path for all subsequent API requests.
     *
     * @param basePath The base path to be set (e.g., "/v1").
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils setBasePath(String basePath) {
       // RestAssured.basePath = basePath;
    	requestSpecification.basePath(basePath);
        logger.info("Base path set to: " + basePath);
        return this;
    }

    /**
     * Adds a single query parameter to the request specification.
     *
     * @param key   The name of the query parameter.
     * @param value The value of the query parameter.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils addQueryParam(String key, String value) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        if (key != null && value != null) {
            requestSpecification.queryParam(key, value);
            logger.info("Added query parameter: " + key + "=" + value);
        }
        return this;
    }

    /**
     * Adds multiple query parameters to the request specification.
     *
     * @param queryParams A map containing query parameters and their values.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils addQueryParams(Map<String, String> queryParams) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        if (queryParams != null) {
            requestSpecification.queryParams(queryParams);
            logger.info("Added query parameters: " + queryParams);
        }
        return this;
    }

    /**
     * Adds a single path parameter to the request specification.
     *
     * @param key   The name of the path parameter.
     * @param value The value of the path parameter.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils addPathParam(String key, String value) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        if (key != null && value != null) {
            requestSpecification.pathParam(key, value);
            logger.info("Added path parameter: " + key + "=" + value);
        }
        return this;
    }

    /**
     * Adds multiple path parameters to the request specification.
     *
     * @param pathParams A map containing path parameters and their values.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils addPathParams(Map<String, String> pathParams) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        if (pathParams != null) {
            requestSpecification.pathParams(pathParams);
            logger.info("Added path parameters: " + pathParams);
        }
        return this;
    }

    /**
     * Sets the request body for POST or PUT requests.
     *
     * @param body The content to be sent in the request body.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils withBody(Object body) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        requestSpecification.body(body);
        logger.info("Request body set: " + body);
        return this;
    }

    /**
     * Adds Basic Authentication to the request specification.
     *
     * @param username The username for authentication.
     * @param password The password for authentication.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils withBasicAuth(String username, String password) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        requestSpecification.auth().preemptive().basic(username, password);
        logger.info("Basic authentication set for user: " + username);
        return this;
    }

    /**
     * Executes a GET request to the specified endpoint.
     *
     * @param endpoint The endpoint to which the GET request is sent.
     * @return The current instance of ApiUtils for method chaining.
     */
    public Response get(String endpoint) {
        logger.info("Executing GET request to: " + endpoint);
        response = requestSpecification.get(endpoint);
        logResponse(response);
        return response;
    }

    /**
     * Executes a POST request to the specified endpoint.
     *
     * @param endpoint The endpoint to which the POST request is sent.
     * @param body     The content to be sent in the request body.
     * @return The Response object containing the response from the server.
     */
    public Response post(String endpoint, Object body) {
        logger.info("Executing POST request to: " + endpoint + " with body: " + body);
        response = RestAssured.given().body(body).when().post(endpoint);
        logResponse(response);
        return response;
    }

    /**
     * Executes a DELETE request to the specified endpoint.
     *
     * @param endpoint The endpoint to which the DELETE request is sent.
     * @return The Response object containing the response from the server.
     */
    public Response delete(String endpoint) {
        logger.info("Executing DELETE request to: " + endpoint);
        response = requestSpecification.when().delete(endpoint);
        logResponse(response);
        return response;
    }

    /**
     * Adds custom headers to the request specification.
     *
     * @param headers A map containing headers and their values.
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils withHeaders(Map<String, String> headers) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        if (headers != null) {
            requestSpecification.headers(headers);
            logger.info("Added headers: " + headers);
        }
        return this;
    }

    /**
     * Sets the Content-Type header for the request.
     *
     * @param contentType The Content-Type to be set (e.g., "application/json").
     * @return The current instance of ApiUtils for method chaining.
     */
    public ApiUtils withContentType(String contentType) {
        if (requestSpecification == null) {
            requestSpecification = RestAssured.given(); 
        }
        requestSpecification.contentType(contentType);
        logger.info("Content-Type set to: " + contentType);
        return this;
    }

    /**
     * Resets the request specification to a clean state.
     * This is useful for starting a new request without retaining previous configurations.
     */
    public void resetRequestSpecification() {
        requestSpecification = null; 
        logger.info("Request specification reset to a clean state.");
    }

    /**
     * Converts the REST Assured response to a specified POJO class.
     *
     * @param response The REST Assured response.
     * @param clazz    The class of the POJO to convert to.
     * @param <T>      The type of the POJO.
     * @return An instance of the specified POJO, or null if deserialization fails.
     */
    public <T> T convertResponseToPojo(Response response, Class<T> clazz) {
        String jsonResponse = response.asString();
        try {
            return objectMapper.readValue(jsonResponse, clazz);
        } catch (JsonProcessingException e) {
            logger.error("Error converting response to POJO: " + e.getMessage());
        }
        return null;
    }

    /**
     * Returns the last executed response.
     *
     * @return The Response object from the last executed request.
     */
    public Response apiResponse() {
        return response;
    }

    /**
     * Logs the details of the response.
     *
     * @param response The response object to log.
     */
    private void logResponse(Response response) {
        logger.info("Response Status Code: " + response.getStatusCode());
        logger.info("Response Body: ");
        logger.info(response.getBody().asPrettyString());
    }
}