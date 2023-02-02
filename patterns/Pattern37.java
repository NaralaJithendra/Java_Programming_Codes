package com.examples.java.patterns;
/*

5
    1
   212
  32123
 4321234
543212345


 */
import java.util.Scanner;

public class Pattern37 {
	public static void pattern(int a) {
		int b=a-1;
		for(int i=1;i<a+1;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(" ");
			}
			b-=1;
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			for(int j=2;j<i+1;j++) {
				System.out.print(j);
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
