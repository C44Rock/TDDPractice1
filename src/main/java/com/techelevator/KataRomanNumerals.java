package com.techelevator;

import java.util.NavigableMap;
import java.util.TreeMap;

public class KataRomanNumerals {
	
	public String numberToNumeral(int number) {
		
		NavigableMap<Integer, String> numeralMap = new TreeMap<Integer, String>();
		
		numeralMap.put(1000, "M");
		numeralMap.put(900, "CM");
		numeralMap.put(500, "D");
		numeralMap.put(400, "CD");
		numeralMap.put(100, "C");
		numeralMap.put(90, "XC");
		numeralMap.put(50, "L");
		numeralMap.put(40, "XL");
		numeralMap.put(10, "X");
		numeralMap.put(9, "IX");
		numeralMap.put(5, "V");
		numeralMap.put(4, "IV");
		numeralMap.put(1, "I");
		
		int closest = 0;
		String finalNumeral = "";
		
		while (number > 0) {
			closest = numeralMap.floorKey(number);
			finalNumeral += numeralMap.get(closest);
			number -= closest;
		}
		
		return finalNumeral;

	}
}
