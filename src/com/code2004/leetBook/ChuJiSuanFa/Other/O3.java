package com.code2004.leetBook.ChuJiSuanFa.Other;

public class O3 {
    public int reverseBits(int n) {

        int ret = 0;
        int times = 32;
        while (times > 0) {
            int lastBit = n & 1;
            ret = ret << 1;
            ret += lastBit;
            n = n >>> 1;
            times--;
        }

        return ret;
    }

    private void test() {

        Integer n = 43261596;
        System.out.println(reverseBits(n));
//        n = Integer.MAX_VALUE;
//        System.out.println(n);
        System.out.println(reverseBits(n));
//        n = 429496729;
//        System.out.println(reverseBits(n));
    }
    
    public static void main(String[] args) {
    
        new O3().test();
    }
}
