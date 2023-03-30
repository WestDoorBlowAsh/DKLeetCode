package com.code2004.leetBook.ChuJiSuanFa.string;

public class S7 {
    public int strStr(String haystack, String needle) {

        int i = 0, j = 0;

        if (needle.length() == 0) return 0;

        while (i < haystack.length() && j < needle.length()) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }

            i++;

            if (j == needle.length()) {
                return i - j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        S7 obj = new S7();

        String haystack = "hello", needle = "h";
        System.out.println(obj.strStr(haystack, needle));

        haystack = "hello";
        needle = "el";
        System.out.println(obj.strStr(haystack, needle));

        haystack = "mississippi";
        needle = "issip";
        System.out.println(obj.strStr(haystack, needle));
    }
}
