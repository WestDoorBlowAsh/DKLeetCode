package com.code.sort;

import java.util.Arrays;

public class Sort1_Bubble {

    public void sort(int[] nums) {
        int exeCount = 0;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                exeCount++;
            }
        }

        System.out.println("exe count = " + exeCount);
    }

    // 优化
    public void sort2(int[] nums) {
        int exeCount = 0;
        int len = nums.length;
        boolean isSorted = true;
        for (int i = 0; i < len - 1 && isSorted; i++) {
            isSorted = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted = true;
                }
                exeCount++;
            }
        }

        System.out.println("exe count = " + exeCount);
    }

    private void test() {

//        int[] nums = {0,1,2,2,3,0,4,2};
//        sort(nums);
//        System.out.println(Arrays.toString(nums));

        int[] nums = new int[]{3,5,6,2,6,7,2,6,9,2,1,3,6,9,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = new int[]{3,5,6,2,6,7,2,6,9,2,1,3,6,9,0};
        sort2(nums2);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        new Sort1_Bubble().test();
    }
}
