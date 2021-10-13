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
public class StateFarmMicroserviceController {
	
	@RequestMapping(value="/getPlans", method=RequestMethod.POST)
	public ResponseEntity<Object> getPlans(@RequestBody Customer customer) {
		List<Plan> plans = new ArrayList<>();
		
		Double price = 220.0;
		Vehicle vehicle = customer.getVehicles().get(0);
		if(vehicle.getYear() < 2010) {
			price += 7;
		}
		if(vehicle.getMileage() > 100000) {
			price += 6;
		}
		if(vehicle.getEstimatedAnnualMileage() > 10000) {
			price += 4;
		}
		if(vehicle.getPurpose() == "Personal") {
			price += 4;
		}
		if(vehicle.getOwnership() == "Used" || vehicle.getOwnership() == "Rented") {
			price += 9;
		}
		
		List<String> benefits = new ArrayList<>();
		benefits.add("Liability insurance can help protect you and your assets from lawsuits and losses caused by bodily injury and property damage.");
		benefits.add("Bodily injury liability coverage pays for the costs associated with injuries for which you are legally liable.");
		benefits.add("Property damage liability coverage pays for damage done to another person’s or company’s property, as well as for the loss of use of that property.");
		benefits.add("Coverage is limited at $100,000 for injuries for each person. $300,000 for injuries total for each accident. $100,000 for property damage for each accident.");
		
		List<String> benefits2 = new ArrayList<>();
		benefits2.add("Includes all the benefits of the Liability Insurance plan.");
		benefits2.add("Protects against collisions to your vehicle with added deductibles.");
		benefits2.add("Coverage also applies to accidents other than collisions, such as car theft, fires, weather, and accidents involving wild animals.");

		plans.add(new Plan("Liability Coverage", price, benefits));
		plans.add(new Plan("Comprehensive Coverage", price + 60, benefits2));
		
		return new ResponseEntity<Object>(plans, HttpStatus.OK);
	}
	
	
}
