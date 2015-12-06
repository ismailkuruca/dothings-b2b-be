package com.dothings.model;

import java.io.Serializable;

public class LatLng implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String lat;
	
	private String lon;

	public LatLng(String lat, String lon) {
		this.setLat(lat);
		this.setLon(lon);
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
}
