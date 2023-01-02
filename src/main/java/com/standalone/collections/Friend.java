package com.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Friend {

	private List<String> names;
	private Set<String> cities;
	private Map<Integer, String> hobbies;
	private Properties properties;
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	public Map<Integer, String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Friend\nnames: " + names + "\ncities: " + cities + "\nhobbies: " + hobbies + "]";
	}
	
	
}
