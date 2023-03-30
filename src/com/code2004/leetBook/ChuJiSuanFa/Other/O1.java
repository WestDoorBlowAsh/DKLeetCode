package com.code2004.leetBook.ChuJiSuanFa.Other;

public class O1 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }

    private void test() {

        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));

    }

    public static void main(String[] args) {

        new O1().test();
    }
}
