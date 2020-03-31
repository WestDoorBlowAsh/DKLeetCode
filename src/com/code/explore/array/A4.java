package com.code.explore.array;

import java.util.Arrays;

public class A4 {


    public boolean containsDuplicate(int[] nums) {

        if (nums.length == 1) return false;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] num1 = {1,2,3,1};
        int[] num2 = {1,2,3,4};
        int[] num3 = {1,1,1,3,3,4,3,2,4,2};

        A4 obj = new A4();
        System.out.println(obj.containsDuplicate(num1));
        System.out.println(obj.containsDuplicate(num2));
        System.out.println(obj.containsDuplicate(num3));
    }
}
