package com.code.explore.tree;

public class T2 {

    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, Integer min, Integer max) {

        boolean flag = true;
        if (root != null) {

            if (max != null) {
                flag = root.val < max;
            }
            if (min != null) {
                flag = flag && root.val > min;
            }

            flag = flag && isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
        }

        return flag;
    }

    public static void main(String[] args) {

        T2 obj = new T2();

        Integer[] arr;
        TreeNode root;

        arr = new Integer[]{3,9,20,null,null,15,7};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isValidBST(root));

        arr = new Integer[]{2,1,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isValidBST(root));

        arr = new Integer[]{5,1,4,null,null,3,6};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isValidBST(root));

        arr = new Integer[]{10,5,15,null,null,6,20};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.isValidBST(root));

    }
}
