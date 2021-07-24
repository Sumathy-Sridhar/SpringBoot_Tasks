package com.srm.didemo;

public class Countryclass {
	String countryName;
	CapitalClass capital;
	public Countryclass(String countryName, CapitalClass capital) {
		super();
		this.countryName = countryName;
		this.capital = capital;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public CapitalClass getCapitalClass() {
		return capital;
	}
	

}
