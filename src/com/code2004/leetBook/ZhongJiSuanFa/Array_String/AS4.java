package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

import java.util.HashSet;

public class AS4 {

    public int lengthOfLongestSubstring(String s) {

        int i = 0, j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                set.clear();
                j++;
                i = j;
                ch = s.charAt(i);
            }
            set.add(ch);
            max = max > i - j + 1 ? max : i - j + 1;
            i++;
        }

        return max;
    }
    void test() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static void main(String[] args) {
        new AS4().test();
    }
}
