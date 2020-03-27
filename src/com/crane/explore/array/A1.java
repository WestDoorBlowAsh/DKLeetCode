package com.crane.explore.array;

import java.util.Arrays;

public class A1 {

    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        if (len == 0) return 0;
        int i = 0;
        for (int j = 1; j < len; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        A1 obj = new A1();
        System.out.println(obj.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
