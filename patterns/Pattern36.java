package com.examples.java.patterns;
/*

5

1        1
12      21
123    321
1234  4321
1234554321

 */
import java.util.Scanner;

public class Pattern36 {
	public static void pattern(int a) {
		int b=a*2-2;
		for(int i=1;i<a+1;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(j);
			}
			for(int j=0;j<b;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			b-=2;
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
