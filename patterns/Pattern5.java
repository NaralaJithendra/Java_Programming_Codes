package com.examples.java.patterns;
import java.util.*;
/*
  	5
  	
	1
	22
	333
	4444
	55555
 */
public class Pattern5 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
		s.close();
		
	}

}
