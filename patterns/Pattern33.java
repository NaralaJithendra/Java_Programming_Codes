package com.examples.java.patterns;
/*
 
 
  ***  
 *   * 
 *   * 
 ***** 
 *   * 
 *   * 
 *   * 





 */

public class Pattern33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="";
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(((j==1 || j==5) && i!=0) || ((i==0 || i==3) && (j>1 && j<5))) {
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