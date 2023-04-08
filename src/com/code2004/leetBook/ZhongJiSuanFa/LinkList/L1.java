package com.code2004.leetBook.ZhongJiSuanFa.LinkList;

import com.code2004.leetBook.ListNode;

public class L1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = null;
        ListNode preNode = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            preNode.next = new ListNode(sum % 10);
            carry = sum / 10;
            preNode = preNode.next;
        }
        return dummyNode.next;
    }

    public ListNode addTwoNumbersX(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode p1 = l1, p2 = l1;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            l1.val = sum;
            if (l1.next != null) {
                p1 = l1.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            int sum = l1.val + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            l1.val = sum;
            if (l1.next != null) {
                p1 = l1.next;;
            }
            l1 = l1.next;
        }

        if (l2 != null) {
            p1.next = l2;
            int sum = l2.val + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            l2.val = sum;
            if (l2.next != null) {
                p1 = l2.next;
            }
            l2 = l2.next;
        }

        if (flag == 1) {
            ListNode node = new ListNode(flag);
            p1.next = node;
        }
        return p2;
    }

    void test() {
        ListNode l1 = new ListNode(new int[]{2,4,3});
        ListNode l2 = new ListNode(new int[]{5,6,4});
        System.out.println(l1.toString() + '+' + l2.toString());
        System.out.println(addTwoNumbers(l1, l2));

        l1 = new ListNode(new int[]{0});
        l2 = new ListNode(new int[]{0});
        System.out.println(addTwoNumbers(l1, l2));

        l1 = new ListNode(new int[]{9,9,9,9,9,9,9});
        l2 = new ListNode(new int[]{9,9,9,9});
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static void main(String[] args) {
        new L1().test();
    }
}
