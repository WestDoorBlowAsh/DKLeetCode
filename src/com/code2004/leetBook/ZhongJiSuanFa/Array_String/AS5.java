package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

public class AS5 {

    int palindromeEndIndex(String s, int begin, int end) {
        if (s.length() == 1) {
            return 1;
        }
        int last = end;
        boolean isPalindrome = true;
        while (isPalindrome && begin < last) {
            if (s.charAt(begin) != s.charAt(last)) {
                isPalindrome = false;
            }
            begin++;
            last--;
        }
        return isPalindrome ? end : -1;
    }
    public String longestPalindrome1(String s) {

        int max = 1;
        int maxI = 0, maxJ = 0;
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j = s.length() - 1) {

            while (j > i) {
                while (s.charAt(i) != s.charAt(j) && j - i + 1 > max) {
                    j--;
                }
                int endIndex = palindromeEndIndex(s, i, j);
                if (endIndex > 0) {
                    int len = endIndex - i + 1;
                    if (max < len) {
                        max = len;
                        maxI = i;
                        maxJ = endIndex;
                    }
                }
                j--;
                if (j <= i) break;
            }

        }
        return s.substring(maxI, maxJ + 1);
    }

    // 中心扩散法
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int maxLen = 0;
        int i = 0, start = 0, length = s.length();
        while (i < length) {
            if (length - i <= maxLen / 2) {
                break;
            }
            int left = i, right = i;
            while (right < length - 1 && s.charAt(right) == s.charAt(right + 1)) {
                right++;
            }
            i = right + 1;
            while (left > 0 && right < length - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            }
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }
        return s.substring(start, start + maxLen);
    }

    // 动态规划
    void test() {
        String s = "babad";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("aacabdkacaa"));
    }

    public static void main(String[] args) {
        new AS5().test();
    }
}
