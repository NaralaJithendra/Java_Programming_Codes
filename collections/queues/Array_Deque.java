package com.examples.java.collections.queues;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"ArrayDeque\" in \"Java Util\" Package ");
		ArrayDeque<String> heros= new ArrayDeque<>();
		
		heros.add("Iron Man");
	    heros.add("Captain America");
	    heros.add("Thor");
	    heros.add("Hulk");
	    
	    System.out.println(heros);//Output: [Iron Man, Captain America, Thor, Hulk]
	    
	    heros.addFirst("Spider Man");
	    
	    System.out.println(heros);//Output: [Spider Man, Iron Man, Captain America, Thor, Hulk]
	    
	    heros.addLast("Doctor Strange");
	    
	    System.out.println(heros);//Output: [Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange]
	    
	    heros.addFirst("Spider Man");
	    
	    System.out.println(heros);//Output: [Spider Man, Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange]
	    
	    heros.addLast("Doctor Strange");
	    
	    System.out.println(heros);//Output: [Spider Man, Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange, Doctor Strange]
	    
	    System.out.println(heros.getFirst());//Output: Spider Man
	    
	    System.out.println(heros.getLast());//Output: Doctor Strange
	    
	    System.out.println(heros.isEmpty());//Output: false
	    
	    heros.offer("Hawkeye");
	    
	    System.out.println(heros);//Output: [Spider Man, Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange, Doctor Strange, Hawkeye]
	    
	    heros.offerFirst("Black Widow");
	    
	    System.out.println(heros);//Output: [Black Widow, Spider Man, Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange, Doctor Strange, Hawkeye]
	    
	    heros.offerLast("Wanda Maximoff");
	    
	    System.out.println(heros);//Output: [Black Widow, Spider Man, Spider Man, Iron Man, Captain America, Thor, Hulk, Doctor Strange, Doctor Strange, Hawkeye, Wanda Maximoff]
	    
	    System.out.println(heros.size());//Output: 11
	    
	    System.out.println("Heros does  hava \"Marvel\"? "+heros.contains("Marvel"));//Output: Heros does  hava "Marvel"? false
	    
	    System.out.println(heros.peek());//Output: Black Widow
	    
	    System.out.println(heros.peekFirst());//Output: Black Widow
	    
	    System.out.println(heros.peekLast());//Output: Wanda Maximoff
	    
	    System.out.println(heros.pop());//Output: Black Widow
	    
	    System.out.println(heros.poll());//Output: Spider Man
	    
	    System.out.println(heros.pollFirst());//Output: Spider Man
	    
	    System.out.println(heros.pollLast());//Output: Wanda Maximoff
	    
	    System.out.println(heros.remove());//Output: Iron Man
	    
	    System.out.println(heros.removeFirst());//Output: Captain America
	    
	    System.out.println(heros.removeLast());//Output: Hawkeye
	    
	    heros.push("Captain Marvel");
	    System.out.println(heros);//Output: [Captain Marvel, Thor, Hulk, Doctor Strange, Doctor Strange]
	    
	}

}
