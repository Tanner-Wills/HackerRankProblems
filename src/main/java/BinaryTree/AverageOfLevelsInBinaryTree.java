package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree {

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
    public List<Double> averageOfLevels(TreeNode root) {
        // track how many numbers are at each level
        List<Integer> count = new ArrayList<>();

        // track the sum of the numbers at each level
        List<Double> res = new ArrayList<>();

        // recursive function to populate both lists
        average(root, 0, res, count);

        // loop through the list that contains the sum (res)
        // update the value by dividing it by the quantity of numbers on that level (count).
        // Now contains averages instead of sums
        for (int i = 0; i < res.size(); i++) {
            res.set(i, res.get(i) / count.get(i));
        }
        // return updated list
        return res;
        }

    public void average(TreeNode t, int i, List < Double > sum, List < Integer > count) {
        // base case
        if (t == null)
            return;

        // using variable "i" to track the level,
        // if "i" < sum.size(), then a node at that level has already been seen,
        // sum the current node value to the value stored at the "i" index of the sum array
        // increment the count array
        if (i < sum.size()) {
            sum.set(i, sum.get(i) + t.val);
            count.set(i, count.get(i) + 1);

        // else, i == sum.size(), so no nodes have been seen at that level yet.
        // add the current node value to the end of the sum array.
        // add 1 to the end of the count array to show we have seen one node at that level / index
        } else {
            sum.add(1.0 * t.val); // current nodes value added to end of the list
            count.add(1); // added 1 number to the current "level" of the tree
        }

        // recursively loop for left and right nodes
        // increment "i" to track the level / index position of the ArrayLists
        average(t.left, i + 1, sum, count);
        average(t.right, i + 1, sum, count);
    }
}
