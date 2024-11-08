package com.qa.stepdefinations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import com.qa.requestspecifications.ApiUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class LibraryAPIStepDefination {

	private ApiUtils apiUtil;
	private Response response;

	public LibraryAPIStepDefination() {

		this.apiUtil = new ApiUtils();
	}

	/**
	 * 
	 * Scenario : GET /getPlace Operation
	 * 
	 * 
	 */

	@Given("I set Base Uri for {string} API")
	public void i_set_base_uri_for_Library_api(String apiName) {
		apiUtil.setBaseUri(apiName);

	}

	@When("I set Base Path as {string}")
	public void i_set_base_path_for_Library_api(String basePath) {
		apiUtil.setBasePath(basePath);

	}

	@And("I set below query parameters:")
	public void i_set_query_params_for_Library_api(DataTable datatable) {
		Map<String, String> queryParams = datatable.asMap(String.class, String.class);
		
		
		apiUtil.addQueryParams(queryParams);

	}

	@And("I send a Get request for Library API")
	public void i_send_a_get_request_for_Library_api() {
		 response=apiUtil.get("");
	}

	@Then("I verify status code is {int}")
	public void i_verify_status_code_is(int status) {
		assertEquals(status, response.getStatusCode(), "status mismatched..");

	}

}
