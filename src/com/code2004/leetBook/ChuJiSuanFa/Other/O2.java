package com.code2004.leetBook.ChuJiSuanFa.Other;

public class O2 {

    public int hammingDistance(int x, int y) {
        int cnt = 0;
        while (x != 0 || y != 0) {
            cnt += (x & 1) ^ (y & 1);
            x = x >>> 1;
            y = y >>> 1;
        }

        return cnt;
    }


    private void test() {

        System.out.println(hammingDistance(1,4));
        
    }
    
    public static void main(String[] args) {
    
        new O2().test();
    }
}
