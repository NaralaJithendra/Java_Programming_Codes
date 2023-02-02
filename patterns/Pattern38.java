package com.examples.java.patterns;
/*

7


* 
 * * 
  * * * 
   * * * * 
  * * * 
 * * 
* 



 */
import java.util.Scanner;

public class Pattern38 {
	public static void pattern(int a) {
		int b=0;
		if(a%2!=0) {
			for(int i=1;i<(a+1)/2+1;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(" ");
				}
				b+=1;
				for(int j=0;j<i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=(a+1)/2-1;i>0;i--) {
				for(int j=0;j<b-2;j++) {
					System.out.print(" ");
				}
				b-=1;
				for(int j=0;j<i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
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
