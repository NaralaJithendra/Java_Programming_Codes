package com.examples.java.collections.lists;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"Vector\" in \"Java Util\" Package ");
		Vector<String> vector = new Vector<String>(5);
		
		vector.add("Java");
		vector.add("Python");
		vector.add("Html");
		vector.add("Spring Boot");
		vector.add("ReactJS");
		
		System.out.println(vector);// Output: [Java, Python, Html, Spring Boot, ReactJS]
		
		System.out.println("Size is: "+vector.size());  // Output: Size is: 5
        
		System.out.println("Default capacity is: "+vector.capacity());// Output:   Default capacity is: 5
        
		vector.add("AngularJS");
        vector.add("Microservices");
        
        System.out.println(vector);// Output: [Java, Python, Html, Spring Boot, ReactJS, AngularJS, Microservices]
        
        System.out.println("Size is: "+vector.size());  // Output: Size is: 7
        
        System.out.println("Default capacity is: "+vector.capacity());// Output:   Default capacity is: 10
        
        if(vector.contains("DevOps"))  
        {  
           System.out.println("DevOps is present at the index " +vector.indexOf("DevOps"));  
        }  
        else  
        {  
           System.out.println("DevOps is not present in the list.");  
        } 
        // Output: DevOps is not present in the list.
        
        System.out.println("The first animal of the vector is = "+vector.firstElement());  // Output:  The first animal of the vector is = Java
        
        System.out.println("The last animal of the vector is = "+vector.lastElement());// Output: The last animal of the vector is = Microservices
        
        System.out.println(vector);// Output: [Java, Python, Html, Spring Boot, ReactJS, AngularJS, Microservices]
        
        System.out.println("Remove first element : "+vector.remove("Java")); // Output: Remove first element : true
        
        System.out.println(vector);// Output: [Python, Html, Spring Boot, ReactJS, AngularJS, Microservices]
        
        System.out.println("Remove element at index 10: " +vector.remove(4)); // Output: Remove element at index 10: AngularJS
        
        System.out.println("New Value list in vector: " +vector);  // Output: New Value list in vector: [Python, Html, Spring Boot, ReactJS, Microservices]
        
        System.out.println("Element at index 1 is = "+vector.get(1));  // Output: Element at index 1 is = Html
	}

}
