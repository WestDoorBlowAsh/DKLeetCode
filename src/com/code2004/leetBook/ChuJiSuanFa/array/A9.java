package com.code2004.leetBook.ChuJiSuanFa.array;

import java.util.Arrays;

public class A9 {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];

                if (sum == target && nums[i] != nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[][] test = {
                {2,2,3,1},
                {2,3,5},
                {4,6,7,8}
        };

        int[] targets = {4,8,13};

        for (int i = 0; i < test.length; i++) {

            A9 obj = new A9();
            System.out.println(Arrays.toString(obj.twoSum(test[i], targets[i])));
        }


    }
}
