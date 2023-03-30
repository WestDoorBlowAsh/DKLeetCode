package com.code2004.leetBook.ChuJiSuanFa.math;

public class M3 {

    public boolean isPowerOfThree(int n) {

        if (n > 1) {
            while (n % 3 == 0) {
                n /= 3;
            }
        }
        return n == 1;
    }

    private void test() {

        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(6));
        System.out.println(isPowerOfThree(81));
    }
    
    public static void main(String[] args) {
    
        new M3().test();
    }
}
