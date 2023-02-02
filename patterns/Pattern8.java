package com.examples.java.patterns;
import java.util.*;
/*
		5
		
		*
		*1*
		*121*
		*12321*
		*1234321*
		*123454321*
		*1234321*
		*12321*
		*121*
		*1*
		*


*/
public class Pattern8 {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("*");
        for(int i=1;i<=a;i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j1=i-1;j1>0;j1--){
                System.out.print(j1);
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i1=a-1;i1>0;i1--){
            System.out.print("*");
            for(int j11=1;j11<=i1;j11++){
                System.out.print(j11);
            }
            for(int j12=i1-1;j12>0;j12--){
                System.out.print(j12);
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("*");
        s.close();
    }
}