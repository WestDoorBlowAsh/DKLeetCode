package com.code2004.leetBook.ChuJiSuanFa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T4 {

    List<List<Integer>> arr = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder1(TreeNode root) {

        if (root == null) return arr;
        levelArray(root, 0);

//        System.out.println(arr);
//        arr.removeIf((x) -> true);
        return arr;
    }

    void levelArray(TreeNode root, int index) {


        if (arr.size() == index) {
            List<Integer> one = new ArrayList<>();
            arr.add(one);
        }

        arr.get(index).add(root.val);

        if (root.left != null) {
            levelArray(root.left, index+1);
        }

        if (root.right != null) {
            levelArray(root.right, index+1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        int level = 0;

        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {

            if (level == res.size()) {
                res.add(new ArrayList<>());
            }

            // 获取当前队列长度
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();

                res.get(level).add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            level++;
        }

        return res;
    }


    public static void main(String[] args) {

        T4 obj = new T4();

        Integer[] arr;
        TreeNode root;

        arr = new Integer[]{1,2,2,2,null,2};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.levelOrder(root));

        arr = new Integer[]{1,2,2,3,4,4,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.levelOrder(root));

        arr = new Integer[]{1,2,2,null,3,null,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.levelOrder(root));

        arr = new Integer[]{1,2,2,3,null,null,3};
        root = TreeNode.createTreeNode(arr);
        System.out.println(obj.levelOrder(root));

    }
}
