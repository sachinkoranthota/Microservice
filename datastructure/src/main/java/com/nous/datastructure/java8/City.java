package com.nous.datastructure.java8;

public class City {
	
	private String name;
	private Integer temp;
	
	public City(String name, Integer temp) {
		super();
		this.name = name;
		this.temp = temp;
	}
	
	//returns name of city
	public String getName() {
		return name;
	}
	
	//setter method for city name
	public void setName(String name) {
		this.name = name;
	}
	
	//returns temperature of city
	public Integer getTemp() {
		return temp;
	}
	
	//setter method for city temperature 
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	
	@Override
	public String toString() {
		return "City name is "+this.getName()+" and temperature of the city is "+this.getTemp()+"\n";
	}


}
