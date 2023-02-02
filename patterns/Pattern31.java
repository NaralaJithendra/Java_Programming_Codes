package com.examples.java.patterns;
/*
 
5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 


   
 */
import java.util.Scanner;

public class Pattern31 {

	public static void pattern(int n) {
		int k=n-1;
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			k-=1;
			for(int l=1;l<i+1;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		k=0;
		for(int i=n;i>0;i--) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			k+=1;
			for(int l=i;l>0;l--) {
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