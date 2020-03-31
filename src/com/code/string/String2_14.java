package com.code.string;

public class String2_14 {

    public String longestCommonPrefix(String[] strs) {

        int len = strs.length;

        if (len == 0) return "";
        if (len == 1) return strs[0];

        int fLen = strs[0].length();

        int i = 1;
        int cLen = 1;

        while (i < len && cLen < fLen) {

            String prefix = strs[0].substring(0,cLen);

            if (strs[i].startsWith(prefix)) {
                i++;
                continue;
            }



        }

        return "";
    }

    public static void main(String[] args) {

        String[] a1 = {"flower","flow","flight"};
        String[] a2 = {"dog","racecar","car"};

        String2_14 s = new String2_14();

        System.out.println(s.longestCommonPrefix(a1));
        System.out.println(s.longestCommonPrefix(a2));
    }
}
