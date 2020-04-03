package com.code.explore.tree;

public class T1 {
    public int maxDepth1(TreeNode root) {
        int dep = 0;
        if (root != null) {
            dep = 1;
            int lDep = maxDepth1(root.left);
            int rDep = maxDepth1(root.right);
            dep += lDep > rDep ? lDep : rDep;
        }
        return dep;
    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
    }
    
    public static void main(String[] args) {
    
        T1 obj = new T1();

        Integer[] arr = new Integer[]{3,9,20,null,null,15,7};
        TreeNode root = TreeNode.createTreeNode(arr);
        System.out.println(obj.maxDepth(root));
    }

}
