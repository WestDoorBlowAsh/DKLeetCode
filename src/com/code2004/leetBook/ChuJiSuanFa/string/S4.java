package com.code2004.leetBook.ChuJiSuanFa.string;

import java.util.HashMap;

public class S4 {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            map.put(sCh, map.getOrDefault(sCh, 0) + 1);
            map.put(tCh, map.getOrDefault(tCh, 0) - 1);
        }

        for (Integer i : map.values()) {
            if (i != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        S4 obj = new S4();

        String s = "anagram", t = "nagaram";
        System.out.println(obj.isAnagram(s, t));

        s = "rat";
        t = "car";
        System.out.println(obj.isAnagram(s, t));
    }
}
