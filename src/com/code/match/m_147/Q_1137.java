package com.code.match.m_147;

public class Q_1137 {


    public int tribonacci1(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int sum = tribonacci1(n - 1) + tribonacci1(n - 2) + tribonacci1(n - 3);
        return sum;
    }

    public int tribonacci(int n) {

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;

        if (n < 0) return -1;
        if (n == 0) return t0;
        if (n == 1) return t1;
        if (n == 2) return t2;

        int sum = t0 + t1 + t2;

        for (int i = 3; i < n; i++) {

            t0 = t1;
            t1 = t2;
            t2 = sum;

            sum = t0 + t1 + t2;
        }

        return sum;
    }


    public static void main(String[] args) {

        int result = new Q_1137().tribonacci(3);
        System.out.println(result);

        result = new Q_1137().tribonacci(4);
        System.out.println(result);

        result = new Q_1137().tribonacci(25);
        System.out.println(result);

    }
}
