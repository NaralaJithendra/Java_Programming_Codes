package com.examples.java.patterns;
/*
 
5


 5 5 5 5 5 
  4 4 4 4 
   3 3 3 
    2 2 
     1 


 */
import java.util.Scanner;

public class Pattern27 {

	public static void pattern(int n) {
		int k=1;
		for (int i=n;i>0;i--) {
			for(int j=k;j>0;j--) {
				System.out.print(" ");
			}
			k=k+1;
			for(int l=1;l<i+1;l++) {
				System.out.print(i+" ");
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

