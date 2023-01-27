package com.examples.java.collections.sets;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" \"TreeSet\" in \"Java Util\" Package ");
		TreeSet<Character> set = new TreeSet<>();
		for(char c:"Hello How Are You ! Thank You! Tree Maps In Java".toCharArray()) {
			set.add(c);
		}
		System.out.println(set);// Output: [ , !, A, H, I, J, M, T, Y, a, e, h, k, l, n, o, p, r, s, u, v, w]
		System.out.println(set.size());// Output: 22
		System.out.println(set.contains('f'));// Output: false
		System.out.println(set.isEmpty());// Output: false
		System.out.println(set.remove('f'));// Output: false
		System.out.println(set);// Output: [ , !, A, H, I, J, M, T, Y, a, e, h, k, l, n, o, p, r, s, u, v, w]
		set.clear();
		System.out.println(set);// Output: []
	}

}
