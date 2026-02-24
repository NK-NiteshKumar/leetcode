# 1022. [Sum of Root To Leaf Binary Numbers](https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/?envType=daily-question&envId=2026-02-24)

## Solution


```java
class Solution {

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = (sum << 1) + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }

        return dfs(node.left, sum) + dfs(node.right, sum);
    }
}
```
