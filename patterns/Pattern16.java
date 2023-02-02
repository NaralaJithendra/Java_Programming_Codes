package com.examples.java.patterns;
import java.util.*;

/*

7

*
***
*****
*******
*****
***
 *

 */
public class Pattern16 {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a/2;
        for(int i=1;i<=a;i+=2){
            for(int j=0;j<b;j++){
                System.out.print(" ");
            }
            b=b-1;
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        b=a/2-1;
        for(int i1=a-1;i1>0;i1--){
            if(i1%2!=0){
                for(int j1=0;j1<b;j1++){
                    System.out.print(" ");
                }
                b+=1;
                for(int j2=0;j2<i1;j2++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        s.close();
    }
}