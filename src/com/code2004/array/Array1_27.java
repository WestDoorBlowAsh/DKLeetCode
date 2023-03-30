package com.code2004.array;

import java.util.Arrays;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 */

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
        int newLen = removeElement2(nums, val);

        System.out.println(Arrays.toString(nums) + " " + newLen);
    }

    public static void main(String[] args) {

        new Array1_27().test();
    }
}
