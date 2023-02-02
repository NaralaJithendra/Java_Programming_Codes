package com.examples.java.patterns;
/*
 
5

1
11
202
3003
40004
500005


 */
import java.util.Scanner;

public class Pattern42 {
	public static void pattern(int n) {
		System.out.println(1);
		for (int i=1;i<n+1;i++) {
			String s="";
			s+=i;
			for(int j=0;j<i-1;j++) {
				s+="0";
			}
			s+=i;
			System.out.println(s);
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
