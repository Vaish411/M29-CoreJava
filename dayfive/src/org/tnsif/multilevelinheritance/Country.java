//Program to Demonstrate on Multi-level inheritance
//Parent Class 1
package org.tnsif.multilevelinheritance;

public class Country {
	private String countryName;
	private String countryCapital;
	
	//getters and setters
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCapital=" + countryCapital + "]";
	}
	
	
	
}