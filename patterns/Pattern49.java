package com.examples.java.patterns;

import java.util.Scanner;

/*

5

$$$$$
$   $
$   $
$   $
$$$$$

 

 */
public class Pattern49 {
	public static void pattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
			      System.out.print("$");
			    }
			    else {
			      if (j == 0 || j == n - 1) {
			        System.out.print("$");
			      }
			      else {
			        System.out.print(" ");
			      }
			   }
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