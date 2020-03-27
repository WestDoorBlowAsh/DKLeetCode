package com.crane.explore.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S3 {

    public int firstUniqChar1(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // HashMap getOrDefault
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    public int firstUniqChar(String s) {

        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            ArrayList temp = map.get(ch);

            if (temp == null) {
                ArrayList arr = new ArrayList();
                arr.add(i);
                map.put(ch, arr);
            } else {
                temp.add(i);
            }
        }

        int min = -1;

        for (ArrayList<Integer> arr : map.values()) {

            if (arr.size() == 1) {
                Integer index = arr.get(0);
                if (min < 0) min = index;
                min = min < index ? min : index;
            }
        }


        return min;
    }

    public static void main(String[] args) {

        S3 obj = new S3();

        String str = "leetcode";
        System.out.println(obj.firstUniqChar1(str));

        str = "loveleetcode";
        System.out.println(obj.firstUniqChar1(str));

    }
}
