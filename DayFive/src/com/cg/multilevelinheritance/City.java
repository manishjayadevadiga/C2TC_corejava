package com.cg.multilevelinheritance;

public class City extends State{ //extends to parent-> State

	
	private String cityName;
	private String area;

	
	//5.generate getters and setters
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	//6.generate to-string
	
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + "]";
	}
	
	
	
}
