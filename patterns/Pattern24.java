package com.examples.java.patterns;
/*
 
 
5
        * 
      * * 
    * * * 
  * * * * 
* * * * * 



 */
import java.util.Scanner;

public class Pattern24 {

	public static void pattern(int n) {
		int k=n*2-2;
		for (int i=1;i<n+1;i++) {
			for(int j=1;j<k+1;j++) {
				System.out.print(" ");
			}
			k=k-2;
			for(int l=1;l<i+1;l++) {
				System.out.print("* ");
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
