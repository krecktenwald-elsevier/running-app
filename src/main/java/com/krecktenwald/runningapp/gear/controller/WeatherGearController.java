package com.krecktenwald.runningapp.gear.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.krecktenwald.runningapp.gear.domain.Gear;
import com.krecktenwald.runningapp.gear.domain.Outfit;
import com.krecktenwald.runningapp.gear.domain.Weather;

@Controller
public class WeatherGearController {

	@RequestMapping(value = "/gear", method = RequestMethod.GET)
	public ResponseEntity getOutfitFromWeather(@RequestBody Weather weatherRequest) {

		ResponseEntity outfitResponse = null;

		ArrayList<Gear> gearArrayList = new ArrayList<>();

		if(Integer.valueOf(weatherRequest.getTemperature()) > 70){
			gearArrayList.add(new Gear("T-Shirt"));
			gearArrayList.add(new Gear("Shorts"));
		} else {
			gearArrayList.add(new Gear("T-Shirt"));
			gearArrayList.add(new Gear("Shorts"));
			gearArrayList.add(new Gear("Sweathshirt"));
		}

		Outfit outfit = new Outfit(gearArrayList);
		outfitResponse = new ResponseEntity(outfit, HttpStatus.OK);

		return outfitResponse;
	}
}
