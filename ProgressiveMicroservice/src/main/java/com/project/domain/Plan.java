package com.project.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.project.domain.Vehicle;

public class Plan {
	private String name;
	private Double pricePerMonth;
	private List<String> benefits;
	
	public Plan(String name, Double pricePerMonth, List<String> benefits) {
		super();
		this.name = name;
		this.pricePerMonth = pricePerMonth;
		this.benefits = benefits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPricePerMonth() {
		return pricePerMonth;
	}

	public void setPricePerMonth(Double pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}

	public List<String> getBenefits() {
		return benefits;
	}

	public void setBenefits(List<String> benefits) {
		this.benefits = benefits;
	}
}
