package com.examples.java.patterns;
import java.util.*;
/*
 * 
5

A
BB
CCC
DDDD
EEEEE

 */
public class Pattern6 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=64;
        for (int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
            	System.out.print((char)(b+i));
            }
            System.out.println();
        }
        s.close();
	}

}