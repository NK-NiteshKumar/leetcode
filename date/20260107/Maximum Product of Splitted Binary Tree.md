# 1339. [Maximum Product of Splitted Binary Tree](https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/description/?envType=daily-question&envId=2026-01-07)

## Solution

```java
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
    static final int MOD = 1_000_000_007;
    long maxProduct = 0;

    long totalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val 
             + totalSum(root.left) 
             + totalSum(root.right);
    }

    long subtreeSum(TreeNode root) {
        if (root == null) return 0;
        return root.val 
             + subtreeSum(root.left) 
             + subtreeSum(root.right);
    }

    void dfs(TreeNode node, TreeNode root, long total) {
        if (node == null) return;

        if (node != root) {
            long sub = subtreeSum(node);
            long product = sub * (total - sub);
            maxProduct = Math.max(maxProduct, product);
        }

        dfs(node.left, root, total);
        dfs(node.right, root, total);
    }

    public int maxProduct(TreeNode root) {
        long total = totalSum(root);
        dfs(root, root, total);
        return (int)(maxProduct % MOD);
    }
}
```
