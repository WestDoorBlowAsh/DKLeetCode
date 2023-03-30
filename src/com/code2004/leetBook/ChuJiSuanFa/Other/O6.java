package com.code2004.leetBook.ChuJiSuanFa.Other;

import java.lang.reflect.Array;
import java.util.Arrays;

public class O6 {

    void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    public int missingNumber(int[] nums) {

        int lastIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[i] == nums.length) {
                    lastIdx = i;
                } else {
                    if (lastIdx == nums[i]) {
                        lastIdx = i;
                    }
                    swap(nums, i, nums[i]);
                }
            }
        }

        return lastIdx == -1 ? nums.length : lastIdx;
    }

    private void test() {

        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
        int[] nums1 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums1));
    }
    
    public static void main(String[] args) {

        new O6().test();
    }
}
