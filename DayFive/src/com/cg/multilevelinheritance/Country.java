//MULTI-LEVEL INHERITANCE          25-09-2023

package com.cg.multilevelinheritance;

public class Country {
	
	private String countryName;
	private String capital;
	
	
	
//1. generate getters and setters
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	

//2. generate to-string( generate if you want to give inputs through constructors only..)
	
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
	
}

