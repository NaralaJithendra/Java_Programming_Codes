package com.examples.java.collections.queues;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"PriorityQueue\" in \"Java Util\" Package ");
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(4);
	    numbers.add(2);
	    System.out.println(numbers); // Output: [2, 4]

	    numbers.offer(1);
	    System.out.println(numbers);// Output: [1, 4, 2]
	     
	    int number = numbers.peek();
	     
	    System.out.println(number);// Output: 1
	     
	    System.out.println(numbers.remove(1));// Output: true
	     
	    System.out.println(numbers.poll());// Output: 2
	}

}
