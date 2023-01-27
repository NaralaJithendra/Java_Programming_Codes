package com.examples.java.collections.maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigable_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"NavigableMap\" in \"Java Util\" Package ");
		NavigableMap<Integer,String> map = new TreeMap<>();
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
		
		System.out.println(map.values());//Output: [, January, Febraury, March, April, May, June, July, August, September, October, November, December]
		
		//Maintains descending order	
		System.out.println("descendingMap: "+map.descendingMap());//Output: descendingMap: {12=December, 11=November, 10=October, 9=September, 8=August, 7=July, 6=June, 5=May, 4=April, 3=March, 2=Febraury, 1=January, 0=}
	    
		//Returns key-value pairs whose keys are less than or equal to the specified key.  
	    System.out.println("headMap: "+map.headMap(11,true));//Output: headMap: {0=, 1=January, 2=Febraury, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=November}  
	    
	    //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	    System.out.println("tailMap: "+map.tailMap(5,true));//Output: tailMap: {5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=November, 12=December}
	    
	    //Returns key-value pairs exists in between the specified key.  
	    System.out.println("subMap: "+map.subMap(5, false, 12, true));//Output: subMap: {6=June, 7=July, 8=August, 9=September, 10=October, 11=November, 12=December}

	}

}
