package com.examples.java.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"LinkedHashSet\" in \"Java Util\" Package ");
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for(int i=0;i<20;i++) {
			set.add(i*10);
		}
		for(int i=0;i<10;i++) {
			set.add((i+10)*10);
		}
		Set<Integer> s= new HashSet<>();
		s.add(1);
		s.add(5);
		s.add(7);
		System.out.println(set);// Output: [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190]
		System.out.println(set.size());// Output: 20
		System.out.println(set.contains(100));// Output: true
		System.out.println(set.isEmpty());// Output: false
		System.out.println(set.remove(12));// Output: false
		System.out.println(set);// Output: [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190]
		System.out.println(set.removeAll(s));// Output: false
		System.out.println(set);// Output: [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190]
		set.clear();
		System.out.println(set);// Output: []

	}

}
