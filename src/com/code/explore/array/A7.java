package com.code.explore.array;

import java.util.Arrays;

public class A7 {

    public int[] plusOne(int[] digits) {

        int dLen = digits.length;
        int[] res = new int[dLen + 1];

        int bal = 1;
        for (int i = dLen - 1; i >= 0 ; i--) {
            digits[i] += bal;
            if (digits[i] > 9) {
                digits[i] = 0;
                bal = 1;
            } else {
                bal = 0;
            }
        }
        if (bal == 1) {
            int[] addRes = new int[dLen + 1];
            Arrays.fill(addRes, 0);
            addRes[0] = 1;
            return addRes;
        }

        return digits;
    }
    
    public static void main(String[] args) {

        int[] d1 = {1,2,4};
        int[] d2 = {1,9,9,9};
        int[] d3 = {0};
        int[] d4 = {9,9};

        A7 obj = new A7();
        System.out.println(Arrays.toString(obj.plusOne(d1)));
        System.out.println(Arrays.toString(obj.plusOne(d2)));
        System.out.println(Arrays.toString(obj.plusOne(d3)));
        System.out.println(Arrays.toString(obj.plusOne(d4)));
    }
}
