
Feature: Validating Place API's
  
  @AddPlace
  Scenario Outline: Verify if place is being succesfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with "Post" http request
    Then API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_id created maps to "<name>" using "GetPlaceAPI"
    
   Examples:
   					|name 	|language |address 						|
   					|AHouse |English 	|World class center |
   		#			|BHouse |Spanish  |Sea cross center		|
   		
   	@DeletePlace	
   Scenario: Verify if place is being succesfully deleted using DeletePlaceAPI
   	 Given DeletePlace Payload
   	 When user calls "DeletePlaceAPI" with "Post" http request
     Then API call got success with status code 200
     And "status" in response body is "OK"
		