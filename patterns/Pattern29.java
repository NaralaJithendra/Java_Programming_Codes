package com.examples.java.patterns;
/*
 
5

123454321
 1234321
  12321
   121
    1
   
 */
import java.util.Scanner;

public class Pattern29 {

	public static void pattern(int n) {
		int k=0;
		for(int i=n;i>0;i--) {
			for(int j=k;j>0;j--) {
				System.out.print(" ");
			}
			k+=1;
			for(int l=1;l<i+1;l++) {
				System.out.print(l);
			}
			for(int m=i-1;m>0;m--) {
				System.out.print(m);
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