package com.examples.java.patterns;
import java.util.*;
/*
 5
 
    1
   12
  123
 1234
12345
*/
public class pattern13 {
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
		int b=a-1;
        for(int i=1;i<=a;i++){
            for(int j=0;j<b;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
            b=b-1;
        }
        s.close();
	}

}
