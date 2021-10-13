package com.project.domain;

import java.util.ArrayList;
import java.util.List;

import com.project.domain.Vehicle;

public class Customer {
	private Long customerId;

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String phoneNumber;
	private String email;

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int zipCode;
	private String country;
	private List<Vehicle> vehicles = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(Long customerId, String firstName, String lastName, String dateOfBirth, String phoneNumber,
			String email, String addressLine1, String addressLine2, String city, String state, int zipCode,
			String country, List<Vehicle> vehicles) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.vehicles = vehicles;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void ListCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void ListFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void ListLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void ListDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void ListPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void ListEmail(String email) {
		this.email = email;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void ListAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void ListAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void ListCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void ListState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void ListZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void ListCountry(String country) {
		this.country = country;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void ListVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
