package com.code.explore.tree;

import java.util.Arrays;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    static TreeNode createTreeNode(Integer[] arr) {
        return TreeNode.createBinaryTreeByArray(arr, 0);
    }

    private static TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index + 1);
            tn.right = createBinaryTreeByArray(array, 2*index + 2);
            return tn;
        }
        return tn;
    }

    void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        } else {
            System.out.print("null ");
        }
    }

    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        } else {
            System.out.print("null ");
        }
    }

    void afterorder(TreeNode root) {
        if (root != null) {
            afterorder(root.left);
            afterorder(root.right);
            System.out.print(root.val + " ");
        } else {
            System.out.print("null ");
        }
    }

    public static void main(String[] args) {

        TreeNode obj = new TreeNode(-1);

        Integer[] arr = new Integer[]{3,9,20,null,null,15,7};
        TreeNode root = TreeNode.createTreeNode(arr);

        obj.preorder(root);
    }
}
