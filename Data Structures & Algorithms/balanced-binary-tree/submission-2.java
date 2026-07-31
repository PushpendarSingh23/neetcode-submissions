class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;

        // Return true if height exists.
        // Return false if imbalance is found.
    }

    private int checkHeight(TreeNode root) {
        if(root == null) return 0;                           // empty tree

        int left = checkHeight(root.left);                   // left height
        if(left == -1) return -1;                            // imbalance found

        int right = checkHeight(root.right);                 // right height
        if(right == -1) return -1;                           // imbalance found

        if(Math.abs(left - right) > 1) return -1;            // height difference

        return 1 + Math.max(left, right);

        // Calculate both subtree heights.
        // Return -1 immediately if unbalanced.
    }
}