package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.project.domain.Customer;
import com.project.restclients.GeicoRestClient;
import com.project.restclients.ProgressiveRestClient;
import com.project.restclients.StateFarmRestClient;

@RestController
public class PlansController {
	
	@Autowired
	GeicoRestClient geicoRestClient;
	
	@Autowired
	StateFarmRestClient stateFarmRestClient;
	
	@Autowired
	ProgressiveRestClient progressiveRestClient;
	
	@RequestMapping(value="/getGeicoPlans", method=RequestMethod.POST)
	public JsonNode getGeicoPlans(@RequestBody JsonNode customer) {
		return geicoRestClient.getPlans(customer);
	}
	
	@RequestMapping(value="/getStateFarmPlans", method=RequestMethod.POST)
	public JsonNode getStateFarmPlans(@RequestBody JsonNode customer) {
		return stateFarmRestClient.getPlans(customer);
	}
	
	@RequestMapping(value="/getProgressivePlans", method=RequestMethod.POST)
	public JsonNode getProgressivePlans(@RequestBody JsonNode customer) {
		return progressiveRestClient.getPlans(customer);
	}
}