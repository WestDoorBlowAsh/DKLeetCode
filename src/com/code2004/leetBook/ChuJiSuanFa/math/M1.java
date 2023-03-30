package com.code2004.leetBook.ChuJiSuanFa.math;

import java.util.ArrayList;
import java.util.List;

public class M1 {

    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(Integer.toString(i));
            }
        }
        return arr;
    }


    private void test() {

        System.out.println(fizzBuzz(15));
    }

    public static void main(String[] args) {

        new M1().test();
    }
}
