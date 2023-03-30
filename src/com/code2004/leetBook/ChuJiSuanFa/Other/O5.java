package com.code2004.leetBook.ChuJiSuanFa.Other;

import java.util.Stack;

public class O5 {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character ch:
             s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                Character peek = stack.peek();
                if (peek == '(' && ch == ')') {
                    stack.pop();
                } else if (peek == '[' && ch == ']') {
                    stack.pop();
                } else if (peek == '{' && ch == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private void test() {

        String s = "()";
        System.out.println(isValid(s));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("]"));
        System.out.println(isValid("(])"));

    }

    public static void main(String[] args) {

        new O5().test();
    }
}
