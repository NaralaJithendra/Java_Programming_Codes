package com.examples.java.patterns;

import java.util.Scanner;
/*
 
 
5

5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 



 */
public class Pattern22 {
	public static void pattern(int n) {
		for (int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
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
