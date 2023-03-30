package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AS3 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> arr = new ArrayList<>() {{
            add(strs[0]);
        }};
        list.add(arr);
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                List tempArr = list.get(j);

            }
        }

        return list;
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
