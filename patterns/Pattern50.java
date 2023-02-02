package com.examples.java.patterns;
/*
 
 
*******
   *   
   *   
   *   
   *   
   *   
   *   
   *   
****   







 */

public class Pattern50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="";
		for(int i=0;i<9;i++) {
			for(int j=0;j<7;j++) {
				if(j==3 || (i==0 && j!=3) ||(i==8 && j<3)) {
					res+="*";
				}
				else {
					res+=" ";
				}
			}
			res+="\n";
		}
		System.out.println(res);

	}

}