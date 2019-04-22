package com.crane.array;

import java.util.Arrays;

public class Array1_27 {

    public int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement2(int[] nums, int val) {

        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }

    public int removeElement3(int[] nums, int val) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[len-- -1];
            }
        }

        return len;
    }

    private void test() {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int newLen = removeElement3(nums, val);

        System.out.println(Arrays.toString(nums) + " " + newLen);
    }

    public static void main(String[] args) {

        new Array1_27().test();
    }
}
