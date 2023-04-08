package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

import java.util.*;

public class AS3 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] char26 = new char[26];
            for (Character c: strs[i].toCharArray()) {
                char26[c - 'a']++;
            }
            String sortStr = String.valueOf(char26) ;
            if (!map.containsKey(sortStr)) {
                map.put(sortStr, new ArrayList());
            }
            map.get(sortStr).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values());
    }
    public List<List<String>> groupAnagrams1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortStr = String.valueOf(charArr) ;
            if (!map.containsKey(sortStr)) {
                map.put(sortStr, new ArrayList());
            }
            map.get(sortStr).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values());
    }

    private void test() {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(Arrays.toString(strs));
        System.out.println(groupAnagrams(strs));
    }

    public static void main(String[] args) {

        new AS3().test();
    }
}
