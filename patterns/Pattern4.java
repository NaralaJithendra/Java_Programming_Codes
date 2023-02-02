package com.examples.java.patterns;
import java.util.*;
/*
 * 
	5
	
	1
	21
	321
	4321
	54321
	
	
 */
public class Pattern4 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
		s.close();
	}

}
