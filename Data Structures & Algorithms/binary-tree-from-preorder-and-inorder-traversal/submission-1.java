class Solution {
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    public TreeNode build(int[] preorder, int[] inorder, int left, int right) {
        if (left > right) return null;
        // Preorder ka first available element = root
        int rootValue = preorder[idx++];
        TreeNode root = new TreeNode(rootValue);
        // Inorder mein root ko dhundo
        int mid = left;
        while (inorder[mid] != rootValue) { mid++;}
        // Root ke left wale elements
        root.left = build(preorder, inorder, left, mid - 1);
        // Root ke right wale elements
        root.right = build(preorder, inorder, mid + 1, right);
        return root;
    }}
