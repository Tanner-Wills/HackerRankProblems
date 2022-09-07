package AmazonOA;

import javax.swing.tree.TreeNode;

public class SumRootToLeafBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    // global variable to store values
    int rootToLeaf = 0;

    public void preorder(TreeNode r, int currNumber) {
        if (r != null) {
            currNumber = (currNumber << 1) | r.val;
            // if it's a leaf, update root-to-leaf sum
            if (r.left == null && r.right == null) {
                rootToLeaf += currNumber;
            }
            preorder(r.left, currNumber);
            preorder(r.right, currNumber);
        }
    }

    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }

    /*
    // My Alternative Solution
     public int sumRootToLeaf(TreeNode root) {
        List<String> numbers = new ArrayList<>();
        String value = "";
        dfs(root, numbers, value);
        System.out.print(numbers);

        // iterate through List<String> and convert into Integer, then from binary to number
        int summed = 0;
        for (String i : numbers) {
            summed += Integer.parseInt(i,2);
        }
        return summed;
    }

    private void dfs (TreeNode root, List<String> numbers, String value) {
        if (root == null) {
            return;
        }
        value += String.valueOf(root.val);

        // only add if it's a leaf node
        if (root.left == null && root.right == null) {
            numbers.add(value);
            return;
        }

        dfs(root.left, numbers, value);
        dfs(root.right, numbers, value);
    }
     */
}

