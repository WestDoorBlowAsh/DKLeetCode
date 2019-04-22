package com.crane.array;

import java.util.Arrays;

public class Array6_41 {

    public int firstMissingPositive(int[] nums) {


        int i = 0;

        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length &&
                    nums[i] != i + 1 &&
                    nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 1; j <= nums.length; j++) {
            if (nums[j - 1] != j) {
                return j;
            }
        }

        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void test(int[] nums) {

        int pos = firstMissingPositive(nums);
        System.out.println(Arrays.toString(nums) + " " + pos);
    }

    public static void main(String[] args) {

        Array6_41 arr = new Array6_41();

        arr.test(new int[]{-1,-2, 0});
        arr.test(new int[]{-2,-1});
        arr.test(new int[]{1,2,0});
        arr.test(new int[]{3,4,-1,1});
        arr.test(new int[]{7,8,9,11,12});
        arr.test(new int[]{1,2,3,4,5});
        arr.test(new int[]{2,3,4,5});

    }
}
