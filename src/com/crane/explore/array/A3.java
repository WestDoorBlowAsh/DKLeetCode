package com.crane.explore.array;

import java.util.Arrays;

public class A3 {

    public void rotate(int[] nums, int k) {

        k %= nums.length;

        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);

    }

    void rotateArray(int[] nums, int begin, int end) {

        while (begin < end) {

            nums[begin] = nums[begin] ^ nums[end];
            nums[end] = nums[begin] ^ nums[end];
            nums[begin] = nums[begin] ^ nums[end];

            begin++;
            end--;
        }
    }
    
    public static void main(String[] args) {

        int[] nums = {1,2};
        int k = 2;
    
        A3 obj = new A3();
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
}
