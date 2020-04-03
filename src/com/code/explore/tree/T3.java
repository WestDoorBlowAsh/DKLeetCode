package com.code.explore.tree;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class T3 {
    public boolean isSymmetric(TreeNode root) {

        Integer[] arr = getTreeNodeArray(root);
        System.out.println(Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    public static <T> T[] concat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    Integer[] getTreeNodeArray(TreeNode root) {

        Integer[] arr = new Integer[]{};
        if (root == null && root.left == null && root.right == null) {
            return arr;
        }
        Integer[] left, right;
        if (root.left != null) {
            left = getTreeNodeArray(root.left);
            arr = concat(arr, left);
        } else {
            arr = concat(arr, new Integer[]{null});
        }
        arr = concat(arr, new Integer[]{root.val});

        if (root.right != null) {
            right = getTreeNodeArray(root.right);
            arr = concat(arr, right);
        } else {
            arr = concat(arr, new Integer[]{null});
        }
        return arr;
    }

    Integer[] getTreeNodeArray1(TreeNode root) {

        Integer[] arr = new Integer[]{};
        if (root == null) {
            return arr;
        }
        Integer[] left, right;
        if (root.left != null) {
            left = getTreeNodeArray(root.left);
            arr = (Integer[]) ArrayUtils.addAll(arr, left);
        } else {
            arr = (Integer[])ArrayUtils.add(arr, null);
        }
        arr = (Integer[])ArrayUtils.add(arr, root.val);
        if (root.right != null) {
            right = getTreeNodeArray(root.right);
            arr = (Integer[])ArrayUtils.addAll(arr, right);
        } else {
            arr = (Integer[])ArrayUtils.add(arr, null);

        }
        return arr;
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
