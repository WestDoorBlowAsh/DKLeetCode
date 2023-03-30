package com.code2004.leetBook.ChuJiSuanFa.math;

import java.util.HashMap;
import java.util.Map;

public class M4 {

    private static final Map<Character, Integer> map = new HashMap();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {

        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == 'V' || ch == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    sum -= map.get('I') * 2;
                }
            } else if (ch == 'L' || ch == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    sum -= map.get('X') * 2;
                }
            } else if (ch == 'D' || ch == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    sum -= map.get('C') * 2;
                }
            }

            sum += map.get(ch);
            i++;
        }

        return sum;
    }

    private void test() {

        String s = "III";
        System.out.println(romanToInt(s));
        s = "IV";
        System.out.println(romanToInt(s));
        s = "IX";
        System.out.println(romanToInt(s));
        s = "LVIII";
        System.out.println(romanToInt(s));
        s = "MCMXCIV";
        System.out.println(romanToInt(s));
        
    }

    public static void main(String[] args) {
    
        new M4().test();
    }
}
