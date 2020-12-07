package com.krecktenwald.runningapp.gear.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Outfit {

	@JsonProperty("gearList")
	private List<Gear> gearList;

	public Outfit() {
	}

	public Outfit(List<Gear> gearList) {
		this.gearList = gearList;
	}

	public List<Gear> getGearList() {
		return gearList;
	}

	public void setGearList(List<Gear> gearList) {
		this.gearList = gearList;
	}
}
