package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		//execute this code only when place_id is null
		//write a code that will give you place_id
		StepDefinition m = new StepDefinition();
		
		if(StepDefinition.place_id == null) {
			
			m.add_place_payload_with("Kulkarni", "French", "Asia");
			m.user_calls_with_http_request("AddPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Kulkarni", "GetPlaceAPI");
		}
	}

}
