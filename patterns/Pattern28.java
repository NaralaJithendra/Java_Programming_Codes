package com.examples.java.patterns;
/*
 
5

! 
! ! 
! ! ! 
! ! ! ! 
! ! ! ! ! 
! ! ! ! 
! ! ! 
! ! 
! 




 */
import java.util.Scanner;

public class Pattern28 {

	public static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for (int l=0;l<i+1;l++) {
				System.out.print("! ");
			}
			System.out.println();
		}
		for (int i=n;i>0;i--) {
			for(int j=i;j>1;j--) {
				System.out.print("! ");
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
