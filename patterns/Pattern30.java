package com.examples.java.patterns;
/*
 
5
   * * * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
        * 
       * * 
      * * * 
     * * * * 
    * * * * * 
   * * * * * * 

   
 */
import java.util.Scanner;

public class Pattern30 {

	public static void pattern(int n) {
		int k=n-2;
		for(int i=n;i>-1;i--) {
			for(int j=k;j>0;j--) {
				System.out.print(" ");
			}
			k+=1;
			for(int l=0;l<i+1;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		k=2*n-2;
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			k-=1;
			for(int l=0;l<i+1;l++) {
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