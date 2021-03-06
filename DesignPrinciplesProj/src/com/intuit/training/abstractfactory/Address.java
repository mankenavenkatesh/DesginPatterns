package com.intuit.training.abstractfactory;

public abstract class Address {

	private String street;
	private String location;
	private String city;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public abstract String getCountry();
	
	@Override
	public String toString() {
		return "Address [ street=" + street
				+ ", location=" + location + ", city=" + city
				+ ", country=" + getCountry() + "]";
	}
	
}
