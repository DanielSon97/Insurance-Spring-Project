package com.project.domain;

public class Vehicle {
	private Long vehicleId;

	private String model;
	private String make;
	private int year;
	private Long mileage;
	private Long estimatedAnnualMileage;

	private String purpose;
	private String ownership;

	public Vehicle() {
		super();
	}

	public Vehicle(Long vehicleId, String model, String make, int year, Long mileage, Long estimatedAnnualMileage,
			String purpose, String ownership) {
		super();
		this.vehicleId = vehicleId;
		this.model = model;
		this.make = make;
		this.year = year;
		this.mileage = mileage;
		this.estimatedAnnualMileage = estimatedAnnualMileage;
		this.purpose = purpose;
		this.ownership = ownership;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Long getMileage() {
		return mileage;
	}

	public void setMileage(Long mileage) {
		this.mileage = mileage;
	}

	public Long getEstimatedAnnualMileage() {
		return estimatedAnnualMileage;
	}

	public void setEstimatedAnnualMileage(Long estimatedAnnualMileage) {
		this.estimatedAnnualMileage = estimatedAnnualMileage;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getOwnership() {
		return ownership;
	}

	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	
	
//	private List<Insured> insured = new ArrayList<>(); 
}
