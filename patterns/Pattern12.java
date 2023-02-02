package com.examples.java.patterns;
import java.util.*;
/*
5
55555
4444
333
22
1
*/
public class Pattern12 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
	}

}
