package com.code2004.string;

public class String1_28 {

    public int strStr(String haystack, String needle) {

        int hLen = haystack.length(), nLen = needle.length(), i = 0, j = 0, k = 0;

        if (nLen == 0) return 0;

        while (k < hLen && hLen >= nLen) {
            i = k;
            j = 0;
            while (j < nLen && i < hLen && haystack.charAt(i++) == needle.charAt(j++)) {
                if (j == nLen) {
                    return k;
                }
            }
            k++;
        }

        return -1;
    }

    public static void main(String[] args) {

        String1_28 s = new String1_28();

        System.out.println(s.strStr("hello", "ll"));
        System.out.println(s.strStr("aaaaa", "bba"));
        System.out.println(s.strStr("aaaaa", ""));
        System.out.println(s.strStr("mississippi", "issipi"));
    }
}
