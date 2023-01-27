package com.examples.java.collections.lists;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_1 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("This ArrayList doesnot have any Type");
		System.out.println(" \"ArrayList\" in \"Java Util\" Package ");
		ArrayList list1 = new ArrayList();
		list1.add("Hi");
		list1.add("World");
		list1.add(1);
		list1.add(2);
		list1.add(1.2f);
		list1.add(10.99f);
		list1.add(1786999.453);
		list1.add(56791325.01);
		list1.add('a');
		list1.add('b');
		list1.add(new int[] {1,2,4,5,10});
		list1.add(new int[] {3,6,8,7,9});
		list1.add(new float[] {1.2f,2.3f,3.4f,4.5f,5.6f});
		list1.add(new float[] {6.7f,7.8f,8.9f,10.11f});
		list1.add(new double[] {11111,2222222,433344,5555555,11111110});
		list1.add(new double[] {333333,4567776,66666778,890687,1346669});
		list1.add(new long[] {1234567890,987654321,234567890,455677723});
		list1.add(new BigInteger[] {new BigInteger("788"),new BigInteger("987654321"),new BigInteger("234567890"),new BigInteger("455677723")});
		Iterator iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/**
		 * //Output:
		 	//"ArrayList" in "Java Util" Package
			//Hi
			//World
			//1
			//2
			//1.2
			//10.99
			//1786999.453
			//5.679132501E7
			//a
			//b
			//[I@762efe5d
			//[I@5d22bbb7
			//[F@41a4555e
			//[F@3830f1c0
			//[D@39ed3c8d
			//[D@71dac704
			//[J@123772c4
			//[Ljava.math.BigInteger;@2d363fb3

		 * 
		 */
		
		
	}

}
