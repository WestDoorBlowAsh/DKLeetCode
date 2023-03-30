package com.code2004.array;

import java.util.Arrays;

public class Array2_26 {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    // need the i == 0 check
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i-1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    // not need the i == 0 check
    public int removeDuplicates3(int[] nums) {
        int i = nums.length < 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[i-1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    private void test() {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int newLen = removeDuplicates(nums);

        System.out.println(Arrays.toString(nums) + " " + newLen);
    }

    public static void main(String[] args) {

        new Array2_26().test();
    }
}
