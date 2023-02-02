package com.examples.java.patterns;

import java.util.Scanner;

/*
 
5
 
* 
* * 
* * * 
* * * * 
* * * * *



 */
public class Pattern17 {
	public static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for (int l=0;l<i+1;l++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		pattern(a);
		sc.close();
	}

}
