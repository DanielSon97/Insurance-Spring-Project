package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.domain.Customer;
import com.project.domain.Plan;
import com.project.domain.Vehicle;
import com.project.plans.PlanCreator;

@RestController
public class ProgressiveMicroserviceController {
	
	@RequestMapping(value="/getPlans", method=RequestMethod.POST)
	public ResponseEntity<Object> getPlans(@RequestBody Customer customer) {
		List<Plan> plans = new ArrayList<>();
		
		Double price = 224.0;
		Vehicle vehicle = customer.getVehicles().get(0);
		if(vehicle.getYear() < 2010) {
			price += 12;
		}
		if(vehicle.getMileage() > 100000) {
			price += 8;
		}
		if(vehicle.getEstimatedAnnualMileage() > 10000) {
			price += 7;
		}
		if(vehicle.getPurpose() == "Personal") {
			price += 6;
		}
		if(vehicle.getOwnership() == "Used" || vehicle.getOwnership() == "Rented") {
			price += 7;
		}
		
		List<String> benefits = new ArrayList<>();
		benefits.add("Auto liability insurance protects you if you’re legally responsible for injuries or property damage in a car accident.");
		benefits.add("Covers damages to other cars, property, injuries, and lawsuits when client is at fault in an accident.");
		benefits.add("Coverage is limited at $50,000 for injuries for each person. $100,000 for injuries total for each accident. $30,000 for property damage for each accident.");
		
		List<String> benefits2 = new ArrayList<>();
		benefits2.add("Includes all the benefits of the Liability Insurance plan.");
		benefits2.add("Comprehensive coverage protects your vehicle from events out of your control, including fire, theft, vandalism, hitting an animal, glass breakage, or acts of nature.");
		benefits2.add("Deductible is $250 for every $2,500 in damages.");

		plans.add(new Plan("Liability Coverage", price, benefits));
		plans.add(new Plan("Comprehensive Coverage", price + 76, benefits2));
		
		return new ResponseEntity<Object>(plans, HttpStatus.OK);
	}
	
	
}
