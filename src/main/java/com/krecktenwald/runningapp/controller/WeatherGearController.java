package com.krecktenwald.runningapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherGearController {

	@GetMapping("/gear")
	public String hello(@RequestParam(name="temperature", required=false, defaultValue="0") String temperature,
						Model model) {

		String gearList = "Snowcap";

		model.addAttribute("temperature", temperature);
		model.addAttribute("gearList", gearList);

		return "gear";
	}
}
