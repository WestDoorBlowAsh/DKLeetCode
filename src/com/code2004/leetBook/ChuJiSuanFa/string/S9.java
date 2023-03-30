package com.code2004.leetBook.ChuJiSuanFa.string;

public class S9 {

    /*
    https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-chang-gong-gong-qian-zhui-by-leetcode/
     */


    // 水平扫描法
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // 水平扫描
    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    // 分治
    public String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix3(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix3(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   longestCommonPrefix3(strs, l , mid);
            String lcpRight =  longestCommonPrefix3(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) ) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }



    public String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0) return "";
        if (strs.length == 1) return strs[0];

        String first = strs[0];
        int lastIdx = -1;
        boolean flag = true;

        for (int i = 0; i < first.length() && flag; i++) {
            char ch = first.charAt(i);

            int sum = 0;

            for (int j = 1; j < strs.length && flag; j++) {
                String str = strs[j];
                if (i < str.length()) {
                    char strCh = str.charAt(i);

                    if (ch == strCh) {
                        sum++;
                    } else {
                        flag = false;
                    }
                } else {
                    flag = false;
                }

                if (sum == strs.length - 1) {
                    lastIdx = i;
                }
            }
        }

        return lastIdx < 0 ? "" : first.substring(0, lastIdx+1);
    }

    public static void main(String[] args) {

        S9 obj = new S9();

        String[] strs = new String[]{"flow","flwer","flight"};
        System.out.println(obj.longestCommonPrefix3(strs));

        strs = new String[]{"flower","flow","floight"};
        System.out.println(obj.longestCommonPrefix3(strs));

        strs = new String[]{"fl","flow","flight"};
        System.out.println(obj.longestCommonPrefix3(strs));

        strs = new String[]{"flow","fl","flight"};
        System.out.println(obj.longestCommonPrefix3(strs));

        strs = new String[]{"aa","ab"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
