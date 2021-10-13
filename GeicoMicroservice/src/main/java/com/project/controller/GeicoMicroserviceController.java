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
public class GeicoMicroserviceController {
	
	@RequestMapping(value="/getPlans", method=RequestMethod.POST)
	public ResponseEntity<Object> getPlans(@RequestBody Customer customer) {
		List<Plan> plans = new ArrayList<>();
		
		Double price = 200.0;
		Vehicle vehicle = customer.getVehicles().get(0);
		if(vehicle.getYear() < 2010) {
			price += 10;
		}
		if(vehicle.getMileage() > 100000) {
			price += 10;
		}
		if(vehicle.getEstimatedAnnualMileage() > 10000) {
			price += 5;
		}
		if(vehicle.getPurpose() == "Personal") {
			price += 5;
		}
		if(vehicle.getOwnership() == "Used" || vehicle.getOwnership() == "Rented") {
			price += 10;
		}
		
		List<String> benefits = new ArrayList<>();
		benefits.add("Liability insurance provides protection against claims resulting from injuries and damage to people and/or property.");
		benefits.add("Liability insurance covers legal costs and payouts for which the insured party would be found liable.");
		benefits.add("Provisions not covered include intentional damage, contractual liabilities, and criminal prosecution.");
		benefits.add("Liability insurance is often required for automotive insurance policies, product manufacturers, and anyone who practices medicine or law.");
		benefits.add("Personal liability, workers' compensation, and commercial liability are types of liability insurance.");
		
		List<String> benefits2 = new ArrayList<>();
		benefits2.add("Includes all the benefits of the Liability Insurance plan.");
		benefits2.add("Provides coverage against damage to client's vehicle in an accident involving another vehicle.");
		benefits2.add("Coverage applies to vandalism, theft, accidents involving animals, falling objects, fires, and weather damage.");

		plans.add(new Plan("Liability Coverage", price, benefits));
		plans.add(new Plan("Collision Insurance", price + 30, benefits2));
		
		return new ResponseEntity<Object>(plans, HttpStatus.OK);
	}
	
	
}
