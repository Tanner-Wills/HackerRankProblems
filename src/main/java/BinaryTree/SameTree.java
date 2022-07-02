package BinaryTree;

public class SameTree {
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
        TreeNode p = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);

        p.left = r1;
        p.right = r2;

        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);

        q.left = q1;
        q.right = q2;

        boolean solution = isSameTree(q, p);
        System.out.println(solution);
    }

    public static Boolean isSameTree(TreeNode q, TreeNode p) {
        if ((p == null) && (q == null)) {
            return true;
        }
        if ((p != null) && (q != null)) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
        return false;
    }
}
