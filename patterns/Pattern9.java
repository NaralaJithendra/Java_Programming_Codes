package com.examples.java.patterns;
import java.util.*;
/*
		5
		*****
		 *****
		  *****
		   *****
		    *****
*/
public class Pattern9 {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j1=0;j1<a;j1++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();

	}
}
