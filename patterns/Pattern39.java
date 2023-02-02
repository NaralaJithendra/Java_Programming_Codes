package com.examples.java.patterns;
/*

5


A
BC
CDE
DEFG
EFGHI

 */
import java.util.Scanner;

public class Pattern39 {
	public static void pattern(int n) {
		char a[]="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for (int i=0;i<n;i++) {
			String c="";
			if(i==0) {
		        System.out.println("A");
			}
		    else {
		        for (int j=i;j<i+i+1;j++) {
		        	c+=a[j];
		        } 
		        System.out.println(c);
		    }
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
