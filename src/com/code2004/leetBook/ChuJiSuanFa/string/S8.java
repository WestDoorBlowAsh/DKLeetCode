package com.code2004.leetBook.ChuJiSuanFa.string;

import java.util.Arrays;
import java.util.HashMap;

public class S8 {

    HashMap<Integer, HashMap<Character, Integer>> buildStringHashMap(String str) {

        HashMap<Integer, HashMap<Character, Integer>> map = new HashMap<Integer, HashMap<Character, Integer>>();

        int key = 0;
        char lastCh = '-';

        int i = 0;
        HashMap<Character, Integer> temp = null;

        while (i < str.length()) {

            char ch = str.charAt(i);

            if (ch != lastCh) {
                key++;
                temp = new HashMap<Character, Integer>();
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
                map.put(key, temp);

                lastCh = ch;
            } else {
                temp = map.get(key);
                temp.put(ch, temp.get(ch) + 1);
            }

            i++;
        }

        return map;
    }

    String convertMap(HashMap<Integer, HashMap<Character, Integer>> map) {

        Integer[] keyArr = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keyArr);

        StringBuilder str = new StringBuilder();
        for (Integer index : keyArr) {
            HashMap<Character, Integer> temp = map.get(index);
            for (HashMap.Entry<Character, Integer> entry : temp.entrySet()) {
                str.append(entry.getValue()).append(entry.getKey());
            }
        }

        return str.toString();
    }

    public String countAndSay(int n) {

        String str = "1";
        int i = 1;

        while (i < n) {
            HashMap<Integer, HashMap<Character, Integer>> map = buildStringHashMap(str);
            str = convertMap(map);
            i++;
        }

        return str;
    }

    public String countAndSay1(int n) {
        if(n == 1){
            return "1";
        }
        return say(countAndSay(n-1));
    }

    private String say(String s) {
        int count = 1;
        char num = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == num) {
                count++;
            } else {
                sb.append(count);
                sb.append(num);
                num = c;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(num);
        return sb.toString();
    }

    public String countAndSay2(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        for (int i = 2; i <= n; i++) {
            String currentStr = new String(sb);
            sb.delete(0, sb.length());
            int num = 0;
            char currentChar = currentStr.charAt(0);

            for (char c : currentStr.toCharArray()) {
                if (c == currentChar) {
                    num++;
                } else {
                    sb.append(num);
                    sb.append(currentStr);
                    currentChar = c;
                    num = 1;
                }
            }
            sb.append(num);
            sb.append(currentChar);
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        S8 obj = new S8();

        int n = 1;
        System.out.println(obj.countAndSay(n));
        n = 2;
        System.out.println(obj.countAndSay(n));
        n = 3;
        System.out.println(obj.countAndSay(n));
        n = 4;
        System.out.println(obj.countAndSay(n));
        n = 5;
        System.out.println(obj.countAndSay(n));
    }
}
