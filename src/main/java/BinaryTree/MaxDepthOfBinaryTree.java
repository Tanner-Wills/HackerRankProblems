package BinaryTree;

import javax.swing.tree.TreeNode;

public class MaxDepthOfBinaryTree {
    // recursive
    /*
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return java.lang.Math.max(left_height, right_height) + 1;
        }
    }

    // Iteration
    public int maxDepth(TreeNode root) {
    LinkedList<TreeNode> stack = new LinkedList<>();
    LinkedList<Integer> depths = new LinkedList<>();
    if (root == null) return 0;

    stack.add(root);
    depths.add(1);

    int depth = 0, current_depth = 0;
    while(!stack.isEmpty()) {
      root = stack.pollLast();
      current_depth = depths.pollLast();
      if (root != null) {
        depth = Math.max(depth, current_depth);
        stack.add(root.left);
        stack.add(root.right);
        depths.add(current_depth + 1);
        depths.add(current_depth + 1);
      }
    }
    return depth;
  }
     */

}
