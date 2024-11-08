Feature: To Verify Library API

@Test
Scenario Outline: Verify Library API get book-by-author operation
Given I set Base Uri for "<ApiName>" API
When I set Base Path as "<BasePath>"
And I set below query parameters:
|AuthorName|Rajesh P|
And I send a Get request for Library API
Then I verify status code is 200

Examples: 
|ApiName|BasePath|
|LibraryApi|/Library/GetBook.php|
