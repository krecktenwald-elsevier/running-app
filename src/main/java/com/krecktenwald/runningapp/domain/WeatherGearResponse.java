package com.krecktenwald.runningapp.domain;

import java.util.List;

public class WeatherGearResponse {

	private List<String> gear;

	public WeatherGearResponse(List<String> gear) {
		this.gear = gear;
	}

	public List<String> getGear() {
		return gear;
	}

	public void setGear(List<String> gear) {
		this.gear = gear;
	}
}
