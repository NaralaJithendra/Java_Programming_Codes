package com.examples.java.patterns;
import java.util.*;
/*

5

*
***
*****
*******
*********

*/
public class Pattern14 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a-1;
        for(int i=1;i<=(a*2);i+=2){
            for(int k=0;k<b;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            b=b-1;
        }
        s.close();
	}

}
