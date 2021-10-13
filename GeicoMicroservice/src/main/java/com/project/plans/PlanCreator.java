package com.project.plans;

import java.util.ArrayList;
import java.util.List;

import com.project.domain.Customer;
import com.project.domain.Plan;
import com.project.domain.Vehicle;

public class PlanCreator {
	
	public Plan liabilityPlan(Customer customer) {
		String name = "Liability Coverage";
		
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
		benefits.add("Provisions not covered include Intentional damage, contractual liabilities, and criminal prosecution.");
		benefits.add("Liability insurance is often required for automotive insurance policies, product manufacturers, and anyone who practices medicine or law.");
		benefits.add("Personal liability, workers' compensation, and commercial liability are types of liability insurance.");
		
		Plan plan = new Plan(name, price, benefits);
		
		return plan;
	}
	
	public Plan collisionPlan(Customer customer) {
		String name = "Collision Insurance";
		
		Double price = 250.0;
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
		benefits.add("Includes all the benefits of the Liability Insurance plan.");
		benefits.add("Provides coverage against damage to client's vehicle in an accidentt involving another vehicle.");
		benefits.add("Coverage applies to vandalism, theft, accidents involving animals, falling objects, fires, and weather damage.");
		Plan plan = new Plan(name, price, benefits);
		
		return plan;
	}
}
