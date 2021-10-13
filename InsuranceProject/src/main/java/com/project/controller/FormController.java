package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.domain.Customer;
import com.project.service.CustomerService;

@Controller
public class FormController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/saveCustomer", method=RequestMethod.POST)
	public ResponseEntity<Object> saveCustomer(@RequestBody Customer customer) {
		Customer savedCustomer = customerService.saveCustomer(customer);
		return new ResponseEntity<Object>(savedCustomer, HttpStatus.OK);
	}
}