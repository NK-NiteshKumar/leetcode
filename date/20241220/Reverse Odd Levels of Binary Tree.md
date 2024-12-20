# 2415. [Reverse Odd Levels of Binary Tree](https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/description/?envType=daily-question&envId=2024-12-20)

## Solution

```java
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        levelTraverse(root.left, root.right, 0);
        return root;
    }

    private void levelTraverse(TreeNode node1, TreeNode node2, int level) {
        if (node1 == null || node2 == null)
            return;
        
        if (level % 2 == 0) {
            int val = node1.val;
            node1.val = node2.val;
            node2.val = val;
        }

        levelTraverse(node1.left, node2.right, level + 1);
        levelTraverse(node1.right, node2.left, level + 1);
    }
}
```
