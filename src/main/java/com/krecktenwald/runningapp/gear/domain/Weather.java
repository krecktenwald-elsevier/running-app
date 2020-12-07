package com.krecktenwald.runningapp.gear.domain;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Weather {

	@JsonProperty
	private int temperature;

	public Weather() {
	}

	public Weather(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
