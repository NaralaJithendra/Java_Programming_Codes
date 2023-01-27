package com.examples.java.collections.lists;

import java.util.ListIterator;
import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"Stack\" in \"Java Util\" Package ");
		Stack<Integer> stk = new Stack<>();  
		stk.push(11);  
		stk.push(22);  
		stk.push(88); 
		stk.push(111);  
		stk.push(221);  
		stk.push(881); 
		stk.push(1121);  
		stk.push(2211);  
		stk.push(8812); 
		
		ListIterator<Integer> ListIterator = stk.listIterator(stk.size());
		
		System.out.println("Iteration over the Stack from top to bottom:");   
		
		while (ListIterator.hasPrevious()){ 
			
			Integer avg = ListIterator.previous();  
			System.out.println(avg);  
		}
		/*
		Ouput: 
		 Iteration over the Stack from top to bottom:
			8812
			2211
			1121
			881
			221
			111
			88
			22
			11
		*/
		boolean isEmpt=stk.empty(); 
		
		System.out.println("Is the stack empty or not? " +isEmpt); //Ouput: Is the stack empty or not? false
		
		int loc= stk.search(88);  
		
		System.out.println("Loc of 88: " + loc); //Ouput: Loc of 88: 7
		
		int first = stk.peek();  
		
		System.out.println("Peek element is: "+first);//Ouput: Peek element is: 8812
		
		Integer x = (Integer) stk.pop();
		
		System.out.println("Pop element is: "+x); //Ouput: Pop element is: 8812
	}
}
