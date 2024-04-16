class AddOneRow {
    public void dfs(TreeNode node, int val, int depth, int curDepth) {
        if (node == null) {
            return;
        }

        if (curDepth < depth - 1) {
            dfs(node.left, val, depth, curDepth + 1);
            dfs(node.right, val, depth, curDepth + 1);
        }

        if (curDepth == depth - 1) {
            TreeNode exLeft = node.left;
            TreeNode exRight = node.right;
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);

            node.left = newLeft;
            newLeft.left = exLeft;

            node.right = newRight;
            newRight.right = exRight;
        }
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        dfs(root, val, depth, 1);
        return root;
    }
}

//https://leetcode.com/problems/add-one-row-to-tree/
