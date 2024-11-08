Feature: To Verify Google Maps API

#In Progress

@Test123
Scenario Outline: Verify Google Maps API get-place operation
Given I set Base Uri for "<ApiName>" API
When I set Base Path as "<BasePath>"
And I set below query parameters:
|place_id|841d6d7dddc14983222bb9be9286ece7|
|key|qaclick123|
And I send a Get request for Google Map API
Then I verify status code is 200

Examples: 
|ApiName|BasePath|
|GoogleMap|/maps/api/place/get/json|
