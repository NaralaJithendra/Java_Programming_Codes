package com.examples.java.collections.lists;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"LinkedList\" in \"Java Util\" Package ");
		LinkedList<String> heros = new LinkedList<String>();
	    heros.add("Iron Man");
	    heros.add("Captain America");
	    heros.add("Thor");
	    heros.add("Hulk");
	    System.out.println(heros);// output : [Iron Man, Captain America, Thor, Hulk]
	    heros.addFirst("Spider Man");
	    System.out.println(heros);// output : [Spider Man, Iron Man, Captain America, Thor, Hulk]
	    heros.addLast("Doctor Strange");
	    System.out.println(heros);// output : [Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange]
	    heros.removeFirst();
	    System.out.println(heros);// output : [Iron Man, Captain America, Thor, Hulk, Doctor Strange]
	    heros.removeLast();
	    System.out.println(heros);// output : [Iron Man, Captain America, Thor, Hulk]
	    System.out.println(heros.getFirst());// output : Iron Man
	    System.out.println(heros.getLast());// output : Hulk

	}

}
