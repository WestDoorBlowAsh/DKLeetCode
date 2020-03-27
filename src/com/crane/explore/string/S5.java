package com.crane.explore.string;

import java.util.Calendar;

public class S5 {

    private boolean isTestChar(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) return true;
        return false;
    }

    public boolean isPalindrome(String s) {

        int len = s.length();
        if (len == 0) return true;

        int i = 0, j = len - 1;

        while (i < j) {
            char chI = Character.toLowerCase(s.charAt(i));
            char chJ = Character.toLowerCase(s.charAt(j));

            if (!isTestChar(chI)) {
                i++;
                continue;
            }
            if (!isTestChar(chJ)) {
                j--;
                continue;
            }

            if (chI == chJ) {
                i++;
                j--;
            } else {
//                System.out.println(chI + " " + chJ);
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome1(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    public boolean isPalindrome2(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static void main(String[] args) {
    
        S5 obj = new S5();

        String s = "A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(s));

        s = "race a car";
        System.out.println(obj.isPalindrome(s));
    }
}
