package com.nous.datastructure.customhash;

import java.util.HashMap;
import java.util.Map;

public class CharactersCount {
	
	static Map<Character, Integer> characterCount(String str) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c:str.toCharArray()) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		return map;
		
	}

	public static void main(String[] args) {
		
		String str = "NOUS INFOSYSTEMS INFOSYS";
		Map<Character,Integer> map = characterCount(str);
		
		System.out.println(map);

	}

}
