package com.code2004.leetBook.ZhongJiSuanFa.LinkList;

import com.code2004.leetBook.ListNode;

public class L2 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        // 奇数节点
        ListNode oddHead = head, oddCur = head;
        // 偶数节点
        ListNode evenHead = head.next, evenCur = evenHead;
        while (evenCur != null && evenCur.next != null) {
            oddCur.next = oddCur.next.next;
            evenCur.next = evenCur.next.next;
            oddCur = oddCur.next;
            evenCur = evenCur.next;
        }
        oddCur.next = evenHead;
        return oddHead;
    }
    public ListNode oddEvenList1(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        ListNode tail = p, ouPre = tail;
        ListNode jiPre = head, ji = jiPre.next;
        while (ji != tail) {
            jiPre.next = ji.next;
            ji.next = ouPre.next;
            ouPre.next = ji;
            ouPre = ji;
            ji = jiPre.next;
            if (ji == tail) return head;
            if (ji.next == tail) {
                ji.next = tail.next;
                tail.next = ouPre.next;
                ouPre.next = tail;
                return head;
            }
            jiPre = jiPre.next;
            ji = ji.next;
        }
        return head;
    }
    void test() {
        System.out.println(oddEvenList(new ListNode(new int[]{})));
        System.out.println(oddEvenList(new ListNode(new int[]{1,2})));
        System.out.println(oddEvenList(new ListNode(new int[]{1,2,3})));
        System.out.println(oddEvenList(new ListNode(new int[]{1,2,3,4})));
        System.out.println(oddEvenList(new ListNode(new int[]{1,2,3,4,5})));
    }

    public static void main(String[] args) {
        new L2().test();
    }
}
