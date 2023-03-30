package com.code2004.array;

public class Array9_275 {
    public int hIndex(int[] citations) {

        int len = citations.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int med = (high + low) / 2;
            if (citations[med] == len - med) {
                return len - med;
            } else if (citations[med] < len - med) {
                low = med + 1;
            } else {
                high = med - 1;
            }
        }
        return len - low;
    }

    private void test() {
        int[] citations = {1,3,4,7,8};
        int result = hIndex(citations);
        System.out.println(result);
    }

    public static void main(String[] args) {

        new Array9_275().test();
    }
}
