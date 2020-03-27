package com.crane.explore.string;

public class S9 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0) return "";

        String first = strs[0];

        for (int i = 0; i <= first.length(); i++) {
            String sub = first.substring(0, i);
            System.out.println(sub);
        }


        return "";
    }

    public static void main(String[] args) {

        S9 obj = new S9();

        String[] strs = new String[]{"flower","flow","flight"};

        System.out.println(obj.longestCommonPrefix(strs));
    }
}
