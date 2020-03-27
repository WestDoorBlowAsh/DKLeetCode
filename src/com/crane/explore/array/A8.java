package com.crane.explore.array;

import java.util.Arrays;

public class A8 {

    public void moveZeroes1(int[] nums) {
        int nLen = nums.length;
        if (nLen == 0) return;

        int zero = nLen - 1, notZero = nLen - 1;

        while (true) {

            while (notZero >= 0 && nums[notZero] == 0) {
                notZero--;
            }

            while (zero >= 0 && (nums[zero] != 0 || zero > notZero)) {
                zero--;
            }

            if (zero < 0 || notZero < 0 || zero > notZero) break;

            int i = zero;
            int j = notZero;

            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;

                i++;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        int nLen = nums.length;
        if (nLen == 0) return;

        int i = 0, j = 0;

        while (j < nLen) {

            if (nums[j] != 0) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }

        for ( ; i < nLen; i++) {
            nums[i] = 0;
        }
    }

    
    public static void main(String[] args) {

        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {1,0};
        int[] nums3 = {0,1,0};

        A8 obj = new A8();

        obj.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        obj.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));

        obj.moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));
    }
}
