package com.crane.explore.string;

public class S2 {
    public int reverse(int x) {

        int rev = 0;
        while (x != 0) {

            int pop = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10 )) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10 )) return 0;

            x = x / 10;

            rev = rev * 10 + pop;
        }


        return rev;
    }

    public static void main(String[] args) {


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        S2 obj = new S2();
        int num = 123;
        System.out.println(obj.reverse(num));

        num = -123;
        System.out.println(obj.reverse(num));


        num = -4560;
        System.out.println(obj.reverse(num));

        num = 2147483647;
        System.out.println(obj.reverse(num));

        int num1 = 1463847412;
        System.out.println(obj.reverse(num1));

    }
}
