package com.examples.java.collections.lists;

import java.util.*;

public class Brackets {

    public boolean isValidBrackets(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char open = stack.pop();

                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false; // Mismatched pair
                }
            }
        }

        return stack.isEmpty(); // All brackets matched
    }

    public static void main(String[] args) {
        Brackets b = new Brackets();

        System.out.println(b.isValidBrackets("()"));     // true
        System.out.println(b.isValidBrackets("([])"));   // true
        System.out.println(b.isValidBrackets("(]"));     // false
        System.out.println(b.isValidBrackets("([)]"));   // false
        System.out.println(b.isValidBrackets("{[]}"));   // true
        System.out.println(b.isValidBrackets("["));      // false
        System.out.println(b.isValidBrackets(""));       // true
    }
}
