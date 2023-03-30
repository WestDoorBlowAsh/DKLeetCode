package com.code2004.leetBook.ChuJiSuanFa.math;

public class M2 {


    public int countPrimes(int n) {
        int count = 0;
        boolean[] num = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (num[i]) {
                continue;
            }
            count++;
            for (int j = i; j < n; j += i) {
                num[j] = true;
            }
        }
        return count;
    }


    private void test() {

        System.out.println(countPrimes(1));
    }
    
    public static void main(String[] args) {
    
        new M2().test();
    }
}
