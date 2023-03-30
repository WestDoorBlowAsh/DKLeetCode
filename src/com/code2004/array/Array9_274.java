package com.code2004.array;

import java.util.Arrays;

public class Array9_274 {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }

        return citations.length;
    }

    public int hIndex2(int[] citations) {

        int length = citations.length;
        if (length == 0) {
            return 0;
        }
        int[] array = new int[length + 1];
        for (int i = 0; i < length; i++) {
            if (citations[i] > length) {
                array[length] += 1;
            } else {
                array[citations[i]] += 1;
            }
        }

        int t = 0;
        for (int i = length; i >= 0 ; i--) {
            t += array[i];
            if (t >= i) {
                return i;
            }
        }
        return 0;
    }

    public int hIndex3(int[] citations) {

        int n = citations.length;
        int[] buckets = new int[n + 1];
        for (int c: citations) {
            if (c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }

        int count = 0;
        for (int i = n; i >= 0 ; i--) {
            count += buckets[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }

    private void test() {

//        int[] citations = {6,7,6,8,6};
        int[] citations = {5,5,5,5,5};
        int result2 = hIndex2(citations);
        int result3 = hIndex3(citations);
        System.out.println(result2 + "  " + result3);

    }

    public static void main(String[] args) {

        new Array9_274().test();
    }
}
