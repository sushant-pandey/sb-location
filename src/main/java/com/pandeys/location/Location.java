package com.pandeys.location;

public class Location {
	private String locationId;
	private String locationName;
	
	public Location() {
		super();
	}

	public Location(String locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + "]";
	}
	
}
