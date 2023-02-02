package com.examples.java.patterns;

import java.util.Scanner;
/*
 
 
5

X X X X X 
X X X X 
X X X 
X X 
X 


 */
public class Pattern21 {
	public static void pattern(int n) {
		for (int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("X ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		pattern(a);
		sc.close();

	}

}
