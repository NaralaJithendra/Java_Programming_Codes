package com.examples.java.patterns;
import java.util.*;
/*
 * 
5

E
DE
CDE
BCDE
ABCDE

*/
public class Pattern7 {
	public static void main(String[] args) {
		//Your code goes here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=65+a;
        for(int i=1;i<=a;i++){
            b=b-1;
            for(int j=0;j<i;j++){
                System.out.print((char)(b+j));
            }
            System.out.println();
        }
        s.close();
	}
}