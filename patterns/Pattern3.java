package com.examples.java.patterns;
import java.util.*;
/*
 * 
   	5
   	
	55555
	
	55555
	
	55555
	
	55555
	
	55555


 */
public class Pattern3 {


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(a);
            }
            System.out.println('\n');
        }
		s.close();
	}

}
