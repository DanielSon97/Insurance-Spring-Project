package com.project.restclients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.domain.Customer;

@Component
public class ProgressiveRestClient {
	
	//setting baseURL
	private static final String progressiveMicroserviceURL = "http://localhost:8383/";
	
	//setting up logger
	public static final Logger log = LoggerFactory.getLogger(ProgressiveRestClient.class);
	
	//getting plans with given customer info
	public JsonNode getPlans(JsonNode customer) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.postForEntity(progressiveMicroserviceURL + "getPlans", customer, Object.class);

		Object objects = responseEntity.getBody();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode responseObject = mapper.convertValue(objects, JsonNode.class);

		return responseObject;
	}
}
