package com.code.explore.list;

public class L5 {

    /*
        找到前半部分链表的尾节点。
        反转后半部分链表。
        判断是否为回文。
        恢复链表。
        返回结果。
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null) return true;

        // 找到前半部分链表的尾节点。  例. 3,3 => q 是第1个3
        ListNode oneLastNode = findFistPartLastNode(head);

        // 翻转后半部分链表。
        ListNode revTwoList = reverseList(oneLastNode.next);
//        System.out.println(revTwoList);

        // 判断是否为回文
        boolean isPali = isTwoPalindrome(head, revTwoList);

        revTwoList = reverseList(revTwoList);
        oneLastNode.next = revTwoList;
//        System.out.println(head);

        return isPali;
    }

    boolean isTwoPalindrome(ListNode one, ListNode two) {

        ListNode p = one, q = two;

        while (q != null) {
            if (p.val != q.val) {
//                System.out.println(p.val + "  " + q.val);
                return false;
            }
            p = p.next;
            q = q.next;
        }

        return true;
    }



    ListNode reverseList(ListNode head) {

        ListNode pre = new ListNode(-1);
        ListNode p = head;

        while (p != null) {
            ListNode nextTemp = p.next;
            p.next = pre.next;
            pre.next = p;
            p = nextTemp;
        }
        return pre.next;
    }

    ListNode findFistPartLastNode(ListNode head) {
        ListNode p = head, q = head;

        int i = 0;
        while (p.next != null) {
            p = p.next;
            if (i == 0) {
                i = 1;
            } else {
                i = 0;
                q = q.next;
            }
        }
//        System.out.println(q.val);
        return q;
    }


    public static void main(String[] args) {

        L5 obj = new L5();

        int[] arr;
        ListNode head;

        arr = new int[]{1,2,3,3,2,1};
        head = new ListNode(arr);
        System.out.println(head);
        System.out.println(obj.isPalindrome(head));

        arr = new int[]{1,2,3,2,1};
        head = new ListNode(arr);
        System.out.println(head);
        System.out.println(obj.isPalindrome(head));

        arr = new int[]{1,2,3,4,2,1};
        head = new ListNode(arr);
        System.out.println(head);
        System.out.println(obj.isPalindrome(head));

        arr = new int[]{};
        head = new ListNode(arr);
        System.out.println(head);
        System.out.println(obj.isPalindrome(head));

        arr = new int[]{1};
        head = new ListNode(arr);
        System.out.println(head);
        System.out.println(obj.isPalindrome(head));
    }
}
