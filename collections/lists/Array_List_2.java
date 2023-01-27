package com.examples.java.collections.lists;

import java.util.ArrayList;

public class Array_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"ArrayList\" in \"Java Util\" Package ");
		System.out.println("Here we can only add elements of same type ");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Float> list3 = new ArrayList<Float>();
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> list5 = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<5;i++) {
			list2.add(i*123);
			list3.add((float) (i*123.12));
		}
		for(String s:"Hello How Are You I hope You Are Fine Thank You!".split(" ")) {
			list4.add(s);
		}
		//lets check if we add another type of variable
		//list1.add("hey");
		/* got
		   Exception in thread "main" java.lang.Error: 
		   Unresolved compilation problem: 
		   list1 cannot be resolved
		   at com.examples.java.collections.lists.Array_List_2.main(Array_List_2.java:22)
		 */
		list5.add(list2);
		System.out.println(list2);// output: [0, 123, 246, 369, 492]
		System.out.println(list3);// output: [0.0, 123.12, 246.24, 369.36, 492.48]
		System.out.println(list4);// output: [Hello, How, Are, You, I, hope, You, Are, Fine, Thank, You!]
		System.out.println(list5);// output: [[0, 123, 246, 369, 492]]
	}

}
