package com.examples.java.patterns;
/*
 


5
    *
   * *
  *   *
 *     *
*********


 */
import java.util.Scanner;
public class Pattern46{
	public  static void pattern(int n) {
		for (int i=1; i<= n ; i++)
        {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == n || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
	}
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            pattern(n);
            sc.close();
      }
}