package com.code.explore.string;

public class S6 {
    public int myAtoi(String str) {

        int len = str.length();

        int index = 0;
        while (index < len) {
            if (str.charAt(index) != ' ') {
                break;
            }
            index++;
        }

        if (index == len) {
            return 0;
        }

        int sign = 1;
        char first = str.charAt(index);
        if (first == '+') {
            index++;
            sign = 1;
        } else if (first == '-') {
            index++;
            sign = -1;
        }

        int res = 0;
        while (index < len) {
            char currChar = str.charAt(index);

            if (currChar > '9' || currChar < '0') {
                break;
            }

            int num = currChar - '0';

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }

            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && num > - (Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            res = res * 10 + sign * num;
            index++;
        }

        return res;
    }

    public static void main(String[] args) {

        S6 obj = new S6();

        String s = "42";
        System.out.println(obj.myAtoi(s));

        s = "-42";
        System.out.println(obj.myAtoi(s));

        s = "    -42";
        System.out.println(obj.myAtoi(s));

        s = "4234 ssd";
        System.out.println(obj.myAtoi(s));

        s = "cxvxcvxc 34543d";
        System.out.println(obj.myAtoi(s));

        s = "-454584358435";
        System.out.println(obj.myAtoi(s));

    }
}
