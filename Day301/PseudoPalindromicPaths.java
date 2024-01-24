class PseudoPalindromicPaths {
    public int pseudoPalindromicPaths(TreeNode root) {
        return countPseudoPalindromicPaths(root, 0);
    }

    private int countPseudoPalindromicPaths(TreeNode node, int path) {
        if (node == null) {
            return 0;
        }

        path ^= (1 << node.val);

        if (node.left == null && node.right == null) {
            return (path & (path - 1)) == 0 ? 1 : 0;
        }

        return countPseudoPalindromicPaths(node.left, path) + countPseudoPalindromicPaths(node.right, path);
    }
}


//https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
