package com.examples.java.patterns;

import java.util.Scanner;

/*

5

A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
 

 */
public class Pattern48 {
	public static void pattern(int n) {
		int a = 65;
		for (int i = n; i >= 0; i--){  
			for (int j = 0; j <= i; j++){  
				System.out.print((char) (a + j) + " ");  
			}  
			System.out.println();  
		}  
		for (int i = 0; i<= n; i++)  {  
			for (int j = 0; j <= i; j++){  
				System.out.print((char) (a + j) + " ");  
			}  
			System.out.println();  
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
	}
}
