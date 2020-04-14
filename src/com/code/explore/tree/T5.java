package com.code.explore.tree;

public class T5 {

    public TreeNode sortedArrayToBST(int[] nums) {

        int len = nums.length;
        TreeNode root = addNode(nums, 0, len - 1);

        return root;
    }

    TreeNode addNode(int[] nums, int low, int high) {
        if (low > high) return null;
        int index = (low + high) / 2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = addNode(nums, low, index - 1);
        root.right = addNode(nums, index + 1, high);
        return root;
    }

    public static void main(String[] args) {

        T5 obj = new T5();
        T4 obj4 = new T4();

        int[] nums;
        TreeNode node;

        nums = new int[]{-12,-10,-3,0,5,9,11};
        node = obj.sortedArrayToBST(nums);
        System.out.println(obj4.levelOrder(node));


    }
}
