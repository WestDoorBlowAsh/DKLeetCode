package com.code2004.leetBook.ChuJiSuanFa.design_question;

import java.util.Arrays;
import java.util.Random;

public class DQ1 {

    public int[] nums;

    public DQ1(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return this.nums;
    }

    public int[] shuffle() {

        int[] a = nums.clone();
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            int j = r.nextInt(i + 1);
            if (i != j) {
                a[i] ^= a[j];
                a[j] ^= a[i];
                a[i] ^= a[j];
            }
        }

        return a;
    }

    private void test() {

        
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        DQ1 obj = new DQ1(nums);
        int[] param_1 = obj.reset();
        System.out.println(Arrays.toString(param_1));
        int[] param_2 = obj.shuffle();
        System.out.println(Arrays.toString(param_2));
        int[] param_3 = obj.reset();
        System.out.println(Arrays.toString(param_3));
    }
}
