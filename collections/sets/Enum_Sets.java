package com.examples.java.collections.sets;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}
public class Enum_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
	    Iterator<days> iter = set.iterator();  
	    while (iter.hasNext()) { 
	      System.out.println(iter.next()); 
	    }
	  }
	/**
	 //Output:
	  	TUESDAY
		WEDNESDAY
	 */
}
