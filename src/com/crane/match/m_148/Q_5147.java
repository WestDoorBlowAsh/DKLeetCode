package com.crane.match.m_148;

public class Q_5147 {
    public int movesToMakeZigzag(int[] nums) {

        int len = nums.length;
        if (len == 0 || len == 1) return 0;
        if (len == 2) {
            if (nums[0] == nums[1]) {
                return 1;
            } else {
                return 0;
            }
        }

        int i = 0, j = 1, k = 2;

        int sumUp = 0, sumDown = 0;
        int temp = 0;

        while (k < len) {





            i++;
            j++;
            k++;
        }


        return 0;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int[] nums2 = {3,2,1};
        int[] nums3 = {1,1,2};
        int[] nums4 = {2,1,1,4};
        int[] nums5 = {1,1,1};
        int[] nums6 = {1,2,1};
        int[] nums7 = {1,2,1,1};


        Q_5147 obj = new Q_5147();
        System.out.println(obj.movesToMakeZigzag(nums1));
        System.out.println(obj.movesToMakeZigzag(nums2));
        System.out.println(obj.movesToMakeZigzag(nums3));
        System.out.println(obj.movesToMakeZigzag(nums4));
        System.out.println(obj.movesToMakeZigzag(nums5));
        System.out.println(obj.movesToMakeZigzag(nums6));
        System.out.println(obj.movesToMakeZigzag(nums7));
    }
}
