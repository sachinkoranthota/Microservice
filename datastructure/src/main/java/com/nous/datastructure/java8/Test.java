package com.nous.datastructure.java8;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors; 

public class Test {

	public static void main(String[] args) {
		
		Predicate<City> predicate = (City city) -> city.getTemp() <= 40;
		
		List<City> list = new ArrayList<City>();
		
		list.add(new City("Bengaluru", 33));
		list.add(new City("Mysuru", 27));
		list.add(new City("Chikmanglur", 26));
		list.add(new City("Shimoga", 33));
		list.add(new City("Davangere", 33));
		list.add(new City("Chitragdurga", 40));
		list.add(new City("Bellary", 42));
		list.add(new City("Raichur", 45));
		
		List<City> strings = list.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(strings);
	}

}
