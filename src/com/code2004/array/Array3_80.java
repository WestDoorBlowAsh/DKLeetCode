package com.code2004.array;

import java.util.Arrays;

public class Array3_80 {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0;
        int repeat = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                repeat = 1;
            } else {
                repeat++;

                if (repeat <= 2) {
                    i++;
                    nums[i] = nums[j];
                }
            }
        }
        return i+1;
    }

    public int removeDuplicates2(int[] nums) {

        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i-2]) {
                nums[i++] = n;
            }
        }
        return i;

    }

    private void test() {

        int[] nums = {0,1,1,1,2,2,3,3,4};
        int newLen = removeDuplicates2(nums);

        System.out.println(Arrays.toString(nums) + " " + newLen);
    }

    public static void main(String[] args) {

        new Array3_80().test();
    }
}
