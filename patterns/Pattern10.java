package com.examples.java.patterns;
import java.util.*;
/*
	5
	1=1
	1+2=3
	1+2+3=6
	1+2+3+4=10
	1+2+3+4+5=15
*/
public class Pattern10 {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a!=0){
            System.out.println("1=1");
            for(int i=2;i<=a;i++){
                int a1=0;
                for(int j=1;j<i;j++){
                    System.out.print(j+"+");
                    a1+=j;
                }
                System.out.println(i+"="+(a1+i));
            }
        }
        else{
            System.out.print(" ");
        }
        sc.close();
	}
}
