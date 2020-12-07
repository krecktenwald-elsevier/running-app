package com.krecktenwald.runningapp.gear.domain;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Gear {

	@JsonIgnore
	private UUID id;

	@JsonProperty("name")
	private String name;

	public Gear() {
	}

	public Gear(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
