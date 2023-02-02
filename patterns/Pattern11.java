package com.examples.java.patterns;
import java.util.*;
/*
5
13579
35791
57913
79135
91357
*/
public class Pattern11 {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        int k = n*2;
        
        while(i<=k){
            int j = i;
            while(j<k){
                System.out.print(j);
                j+=2;
            }
            if(i>1){
                int l = 1;
        		while(l<i){
                    System.out.print(l);
                    l+=2;
                }
            }
            
            System.out.println();
            i+=2;
        }
        sc.close();
	}
}
