package com.code2004.leetBook.ZhongJiSuanFa.LinkList;

import com.code2004.leetBook.ListNode;

public class L3 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }
    void test() {

    }

    public static void main(String[] args) {
        new L3().test();
    }
}
