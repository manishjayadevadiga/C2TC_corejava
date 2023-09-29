package com.cg.multilevelinheritance;

public class State extends Country{ //extend to parent->Country

	
	private String stateName;
	private String language;
	
	
	
//3.generate getters and setters
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
//4. generate to-string
	
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	

	
	
}