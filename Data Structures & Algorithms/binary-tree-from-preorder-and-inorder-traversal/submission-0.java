/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int idx = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for(int i=0;i<n;i++){
        map.put(inorder[i],i);}
        return build(preorder, 0, inorder.length-1);}
    public TreeNode build(int[] preorder, int left, int right){
        if(left > right) return null;
        int value = preorder[idx++];
        TreeNode root = new TreeNode(value);
        int mid = map.get(value);
        root.left = build(preorder, left, mid - 1);
        root.right = build(preorder, mid + 1, right);

        return root;
    }
}
