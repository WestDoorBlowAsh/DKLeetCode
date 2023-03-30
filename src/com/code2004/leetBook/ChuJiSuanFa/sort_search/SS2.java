package com.code2004.leetBook.ChuJiSuanFa.sort_search;

public class SS2 {

    int version;

    boolean isBadVersion(int n) {
        if (n >= version) return true;
        return false;
    }

    public int firstBadVersion1(int n) {

        int last = n, des = n;
        int first = 1;

        while (des >= first && des <= last && first < last) {
            if (!isBadVersion(des-1) && isBadVersion(des)) {
                return des;
            }
            if (isBadVersion(des)) {
                last = des;
                des = first + (des - first) / 2;
            } else {
                first = des;
                des = des + (last - des) / 2;
            }
        }

        return des;
    }

    public int firstBadVersion(int n) {

        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        SS2 obj = new SS2();
        int n;

        n = 2126753390;
        obj.version = 1702766719;
        System.out.println(obj.firstBadVersion(n));

        n = 5;
        obj.version = 3;
        System.out.println(obj.firstBadVersion(n));
    }
}
