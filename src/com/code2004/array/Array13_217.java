package com.code2004.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */

public class Array13_217 {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {

        Set<Integer> set = new HashSet<Integer>(nums.length);
        for (int x : nums) {
            set.add(x);
        }
        return set.size() == nums.length;
    }

    public boolean containsDuplicate3(int[] nums) {
        return Arrays.stream(nums).distinct().count() == nums.length;
    }

    public boolean containsDuplicate4(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        System.out.println("hahahha = " + Arrays.toString(nums));

        return true;
    }

    private void test() {
        int[] citations = {1,3,4,7,8};
        boolean result = containsDuplicate4(citations);
        System.out.println(result);

//        citations = new int[]{1,1, 3, 4, 7, 8};
//        result = containsDuplicate4(citations);
//        System.out.println(result);

    }

    public static void main(String[] args) {

        new Array13_217().test();
    }
}
