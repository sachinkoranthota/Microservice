package com.nous.datastructure.customhash;

import java.util.HashMap;
import java.util.Map;

public class CustomHashEqual {

	public static void main(String[] args) {
		
		Map<Employee,String> map = new HashMap<Employee,String>();
		
		map.put(new Employee("sachin", (long) 194165, 1000.5689),"NOUS1");
		map.put(new Employee("sachin", (long) 194165, 1000.5689),"NOUS2");
		map.put(new Employee("sachinkoranthota", (long) 194165, 1000.5689),"NOUS3");
		map.put(new Employee("sachikthot", (long) 194165, 1000.5689),"NOUS");
		System.out.println(map);
	}

}
