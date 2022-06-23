package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);

        root.left = null;
        root.right = r1;
        r1.left = r2;

        List<Integer> solution = inorderTraversal(root);
        System.out.println(solution.toString());
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
