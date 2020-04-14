package com.code.explore.tree;

import com.sun.source.tree.Tree;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.LinkedList;

public class T3 {
    public boolean isSymmetric1(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            queue.add(p.left);
            queue.add(q.right);
            queue.add(p.right);
            queue.add(q.left);
        }
        return true;
    }


    public static void main(String[] args) {

        T3 obj = new T3();

        Integer[] arr;
        TreeNode root;

        arr = new Integer[]{1,2,2,2,null,2};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isSymmetric(root));

        arr = new Integer[]{1,2,2,3,4,4,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isSymmetric(root));

        arr = new Integer[]{1,2,2,null,3,null,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isSymmetric(root));

        arr = new Integer[]{1,2,2,3,null,null,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isSymmetric(root));

    }
}
