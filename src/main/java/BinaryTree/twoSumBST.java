package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class twoSumBST {
    public static class TreeNode {
        int val;
        BinaryTreeInorderTraversal.TreeNode left;
        BinaryTreeInorderTraversal.TreeNode right;
        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, BinaryTreeInorderTraversal.TreeNode left, BinaryTreeInorderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    // begin methods
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        List<Integer> list1 = inorderTraversal(root1);
        List<Integer> list2 = inorderTraversal(root2);

        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < list2.size(); i++) {
            map1.put(list2.get(i),i);
        }
        for (int j = 0; j< list1.size(); j++) {
            int current = list1.get(j);
            int balance = target - current;
            if (map1.containsKey(balance)) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        // inorder traversal = LCR
        List<Integer> solution = new ArrayList<>();
        if (root != null) {
            inorderRecursion(root, solution);
        }
        return solution;
    }

    private static void inorderRecursion(TreeNode root, List<Integer> solution) {
        if (root.left != null) {
            inorderRecursion(root.left, solution);
        }
        solution.add(root.val);

        if (root.right != null) {
            inorderRecursion(root.right, solution);
        }
    }
}
