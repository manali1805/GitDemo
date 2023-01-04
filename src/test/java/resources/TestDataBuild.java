package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlaces;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlaces AddPlacePayload(String name, String language, String address ) {
		
		AddPlaces p = new AddPlaces();
		p.setAccuracy(50);
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress(address);
		p.setWebsite("http://manalikulkarni.com");
		p.setLanguage(language);
		
		List<String> l = new ArrayList<String>();
		l.add("shoe park");
		l.add("shop");
		p.setTypes(l);
		
		Location l1 = new Location();
		l1.setLat(-38.383494);
		l1.setLng(33.427362);
		p.setLocation(l1);
		return p;
	}
	
	public String DeletePlacePayload(String placeId) {
		
		return "{\r\n"
				+ "    \"place_id\": \""+placeId+"\"\r\n"
				+ "}";
	}

}
