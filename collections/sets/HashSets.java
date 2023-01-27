package com.examples.java.collections.sets;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"HashSet\" in \"Java Util\" Package ");
		HashSet<String> heros = new HashSet<>();
		heros.add("Iron Man");
	    heros.add("Captain America");
	    heros.add("Thor");
	    heros.add("Hulk");
	    heros.add("Spider Man");
	    heros.add("Doctor Strange");
	    heros.add("Wanda Maximoff");
	    heros.add("Hawckeye");
	    heros.add("Iron Man");
	    heros.add("Captain America");
	    heros.add("Thor");
	    heros.add("Hulk");
	    heros.add("Black Widow");
	    heros.add("Black Panther");
	    heros.add("Groot");
	    heros.add("Krog");
		System.out.println(heros); //Output: [Thor, Iron Man, Captain America, Spider Man, Groot, Black Panther, Doctor Strange, Hawckeye, Black Widow, Krog, Hulk, Wanda Maximoff]
		System.out.println(heros.size()); //Output: 12
		System.out.println(heros.contains("Ant Man"));//Output: false
		System.out.println(heros.isEmpty()); //Output: false
		System.out.println(heros.remove("Krog")); //Output: true
		System.out.println(heros.remove("Ant Man"));//Output: false
		heros.clear();
		System.out.println(heros); //Output: []
	}

}
