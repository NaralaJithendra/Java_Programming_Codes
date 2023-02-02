package com.examples.java.patterns;
/*
 * 

5

10101
01010
10101
01010
10101

 */
import java.util.Scanner;
public class Pattern47{
      
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        	int a;
            if(i%2 == 0){
                a = 0;
                for (int j = 1; j <= n; j++){
                    System.out.print(a);
                      
                    a = (a == 0)? 1 : 0;
                }
            }
            else{
                a = 1;
                for (int j = 1; j <= n; j++){
                    System.out.print(a);
                    a = (a == 0)? 1 : 0;
                }
            }
            System.out.println();
        }
        sc.close();
    }
} 