package com.code.explore.string;

public class S1 {
    public void reverseString(char[] s) {

        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char tem = s[i];
            s[i] = s[j];
            s[j] = tem;
        }
    }

    public static void main(String[] args) {

        S1 obj = new S1();

        char[] c = {'h','e','l','l','o'};

        System.out.println(c);
        obj.reverseString(c);
        System.out.println(c);
    }
}
