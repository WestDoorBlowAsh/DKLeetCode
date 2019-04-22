package com.crane.array;

import java.util.Arrays;

public class Array5_189 {

    public void rotate(int[] nums, int k) {

        int len = nums.length;
        k %= len;
        for (int j = 0; j < k; j++) {
            // 向右一次
            rotateOnce(nums);
        }
    }

    private void rotateOnce(int[] nums) {
        int len = nums.length;
        int last = nums[len - 1];
        for (int i = len - 1; i > 0 ; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }

    public void rotate2(int[] nums, int k) {

        int len = nums.length;
        k %= len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public void rotate3(int[] nums, int k) {

        // 5,6,7,4,1,2,3

        int n = nums.length;
        k %= n;
        // 第一次交换完毕后，前 k 位数字位置正确，后 n-k 位数字中最后 k 位数字顺序错误，继续交换
        for (int start = 0; start < nums.length && k != 0; n -= k, start += k, k %= n) {

            System.out.println("start = " + start + "; " + "k = " + k + "; " + "n = " + n + ";");

            for (int i = 0; i < k; i++) {
                swap(nums, start + i, nums.length - k + i);

                System.out.println("++++++++++++++++++++++++++++++++++++");
                System.out.println(Arrays.toString(nums));
            }

            System.out.println("====================================");
            System.out.println(Arrays.toString(nums));

        }
    }

    public void rotate4(int[] nums, int k) {
        recursiveSwap(nums, k, 0, nums.length);
    }

    private void recursiveSwap(int[] nums, int k, int start, int length) {
        k %= length;

        if (k != 0) {
            for (int i = 0; i < k; i++) {
                swap(nums, start + i, nums.length - k + i);
            }
            recursiveSwap(nums, k, start + k, length - k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void test() {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;


        System.out.println(Arrays.toString(nums));
//        rotate(nums, k);
//        rotate3(nums, k);
        rotate4(nums, k);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        new Array5_189().test();
    }
}
