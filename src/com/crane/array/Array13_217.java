package com.crane.array;

import java.util.HashSet;
import java.util.Set;

public class Array13_217 {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }

        return false;
    }

    private void test() {


    }

    public static void main(String[] args) {

        new Array13_217().test();
    }
}
