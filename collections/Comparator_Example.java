package com.examples.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparator_Example{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Ganesh",23));  
		al.add(new Student(102,"Shiva",27));  
		al.add(new Student(103,"Lakshmi",21)); 
		al.add(new Student(104,"Ram",20));
		al.add(new Student(105,"Hanuman",19));
		al.add(new Student(106,"Sarswathi",20));
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		
		Iterator<Student> itr=al.iterator(); 
		
		while(itr.hasNext()){  
			
			Student st=(Student)itr.next();  
			System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}  
		/*
		 //Output:
		 Sorting by Name
		 101 Ganesh 23
		 105 Hanuman 19
		 103 Lakshmi 21
		 104 Ram 20
		 106 Sarswathi 20
		 102 Shiva 27

		 */
		System.out.println("Sorting by Age");  
		  
		Collections.sort(al,new AgeComparator());  
		
		Iterator<Student> itr2=al.iterator();  
		
		while(itr2.hasNext()){  
			
			Student st=(Student)itr2.next();  
			System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		} 
		/*
		 //Output:
		 Sorting by Age
		 105 Hanuman 19
		 104 Ram 20
		 106 Sarswathi 20
		 103 Lakshmi 21
		 101 Ganesh 23
		 102 Shiva 27

		 */
	}

}
