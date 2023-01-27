package com.examples.java.collections.maps;
import java.util.EnumMap;
import java.util.Map;  
enum Days {  
	   Monday, Tuesday, Wednesday, Thursday  
}; 
public class Enum_Maps {  
    
   public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
	   
	   map.put(Days.Monday, "1");  
	   map.put(Days.Tuesday, "2");  
	   map.put(Days.Wednesday, "3");  
	   map.put(Days.Thursday, "4");  
	   
	   for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	   /*
	    //Output:
	     	Monday 1
			Tuesday 2
			Wednesday 3
			Thursday 4
	    */
	}
}