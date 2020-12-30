package com.pandeys.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@RequestMapping("/locations")
	public List<Location> getLocations(){
		Location location1 = new Location("Location 101", "101 Street, ABC");
		Location location2 = new Location("Location 102", "102 Street, DEF");
		Location location3 = new Location("Location 103", "103 Street, GHI");
		
		List<Location> listOfLocations = new ArrayList<Location>(Arrays.asList(location1, location2, location3));
		return listOfLocations;
	}
}
