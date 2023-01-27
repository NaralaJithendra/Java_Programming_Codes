package com.examples.java.collections.maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"HashMap\" in \"Java Util\" Package "); 
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		String months[]= {"","January","Febraury","March","April","May","June","July","August","September","October","November","December"};
		
		for(int i=0;i<months.length;i++) {
			map.put(i, months[i]);
		}
		
		System.out.println(map);// Output: {0=, 1=January, 2=Febraury, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=November, 12=December}
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		/*
		 // Output:
		   	0: 
			1: January
			2: Febraury
			3: March
			4: April
			5: May
			6: June
			7: July
			8: August
			9: September
			10: October
			11: November
			12: December
		  
		 */
		
		System.out.println(map.entrySet());//Output: [0=, 1=January, 2=Febraury, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=November, 12=December]
		
		System.out.println("All Values in TreeMap: "+map.values());//Output: All Values in TreeMap: [, January, Febraury, March, April, May, June, July, August, September, October, November, December]
		
		System.out.println(map.containsKey(1));//Output: true
		
		System.out.println(map.get(11));//Output: November
		
		if(map.containsKey(11)) {
			map.put(11, map.get(11).toUpperCase());
		}
		
		System.out.println(map);//Output: {0=, 1=January, 2=Febraury, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=NOVEMBER, 12=December}
		
		System.out.println(map.isEmpty());//Output: false
		
		Set<Integer> set = map.keySet();
		System.out.println(set);//Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
		
		System.out.println(map.size());//Output: 13
		
		System.out.println(map);//Output: {0=, 1=January, 2=Febraury, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=NOVEMBER, 12=December}
		
		System.out.println(map.replace(11, "NOVEMBER", "November"));//Output: true
		
		System.out.println(map);//Output: {0=, 1=January, 2=Febraury, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=November, 12=December}


	}

}
