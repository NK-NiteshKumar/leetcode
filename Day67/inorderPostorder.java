class Solution {
    int i, o;
    public TreeNode buildTree(int[] in, int[] po) {
        i = o = po.length - 1;
        return dfs(in, po, 3001);
    }
    
    private TreeNode dfs(int[] in, int[] po, int leftBoundary) {
        if (o == -1 || in[i] == leftBoundary) return null;
        TreeNode node = new TreeNode(po[o--]);
        node.right = dfs(in, po, node.val);
        i--;
        node.left  = dfs(in, po, leftBoundary);
        return node;
    }
}

//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
