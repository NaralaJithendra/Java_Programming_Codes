package com.examples.java.collections.maps;

import java.util.LinkedHashMap;

public class Linked_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\"LinkedHashMap\" in \"Java Util\" package");
		LinkedHashMap<Character,String> map=new LinkedHashMap<Character,String>();        
	    map.put('a',"Amit");    
	    map.put('v',"Vijay");    
	    map.put('r',"Rahul");    
	    System.out.println(map);//Output: {a=Amit, v=Vijay, r=Rahul}
	    map.remove('r');  
	    System.out.println(map);//Output:  {a=Amit, v=Vijay}
	    
	    map.put('t', "Thor");
	    System.out.println(map);//Output: {a=Amit, v=Vijay, t=Thor}
	    
	    map.put('t', "Taylor Swift");
	    System.out.println(map);//Output: {a=Amit, v=Vijay, t=Taylor Swift}
	    
	    System.out.println(map.keySet());//Output: [a, v, t]
	    
	    System.out.println(map.values());//Output:  [Amit, Vijay, Taylor Swift]
	    
	    System.out.println(map.entrySet());//Output: [a=Amit, v=Vijay, t=Taylor Swift]
	    
	    System.out.println(map.get('t'));//Output: Taylor Swift

	}

}
