package com.examples.java.patterns;
/*
 
 
  *  
 * * 
*   *
 * * 
  *  



 */

public class Pattern32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if((i+j==2) || (i-j==2) || (i+j==6) || (j-i==2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}