package com.examples.java.patterns;
import java.util.Scanner;
/*

5

1
232
34543
4567654
567898765

*/
public class Pattern15 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a-1;
        for(int i=1;i<=a;i++){
            for(int k=0;k<b;k++){
                System.out.print(" ");
            }
            b=b-1;
            int d=i;
            for(int j1=0;j1<i;j1++){
                System.out.print(d);
                d+=1;
            }
            for(int j=d-2;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
	}
}
