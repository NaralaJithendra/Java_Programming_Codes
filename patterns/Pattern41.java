package com.examples.java.patterns;
/*

5

1
21
321
4321
54321

 */
import java.util.Scanner;

public class Pattern41 {
	public static void pattern(int n) {
		for (int i=1;i<n+1;i++) {
		    String c="";
		    for (int j=i;j>0;j--) {
		        c+=j;
		    }
		    System.out.println(c);
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
