//Driver Class

package org.tnsif.multilevelinheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		City c = new City();
		c.setCityName("Pune");
		c.setArea("XXX");
		c.setStateName("Maharashtra");
		c.setLanguage("Marathi");
		c.setCountryName("India");
		c.setCountryCapital("Delhi");
		
		System.out.println(c);
	}

}