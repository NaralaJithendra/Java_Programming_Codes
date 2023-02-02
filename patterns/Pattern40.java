package com.examples.java.patterns;
/*
 
5

E
DE
CDE
BCDE
ABCDE

 
 
 */
import java.util.Scanner;

public class Pattern40 {
	public static void pattern(int n) {
		int a=65+n;
		int b=a;
		for (int i=0;i<(n+1);i++) {
			String s="";
			for(int j=a;j<b;j++) {
				char c=(char) j;
				s+=c;
			}
			System.out.println(s);
			a-=1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
		sc.close();
	}

}
