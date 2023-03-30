package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AS1 {
    /*

    -1,0,1,2,-1,-4
    -1,-1,0,1,2,-4
    -2 -1 -1 0 1 2 3
    i     m        n
     */

    public List<List<Integer>> threeSum_X(int[] nums) {

        if (nums.length < 3 || nums.length > 3000) {
            System.out.println("输入不合法");
            return null;
        }

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int a = nums[i];
            int m = i + 1, n = nums.length - 1;
            while (m < n) {
                int b = nums[m], c = nums[n];

                if (a == -(b + c)) {
                    List<Integer> row = new ArrayList<>(Arrays.asList(a, b, c));
                    list.add(row);
                    m++;
                    n = nums.length - 1;
                    continue;
                } else if (a > -(b + c)) {
                    n--;
                } else {
                    m++;
                }
            }

            i++;
        }

        return list;
    }

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3 || nums.length > 3000) {
            System.out.println("输入不合法");
            return null;
        }

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) {
                break;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                int target = -nums[i];
                if (sum == target) {
                    List<Integer> row = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    list.add(row);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return list;
    }

    private void test() {

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
        System.out.println(threeSum(new int[]{0,1,1}));
        System.out.println(threeSum(new int[]{0,0,0}));
        System.out.println(threeSum(new int[]{0,0,0,0}));
        System.out.println(threeSum(new int[]{1,-1,-1,0}));

    }

    public static void main(String[] args) {

        new AS1().test();
    }
}
