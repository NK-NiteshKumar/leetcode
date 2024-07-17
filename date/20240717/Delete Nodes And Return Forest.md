# 1110. [Delete Nodes And Return Forest](https://leetcode.com/problems/delete-nodes-and-return-forest/description/?envType=daily-question&envId=2024-07-17)

## Solution

```java
class Solution {
    private List<TreeNode> ans;

    private void dfs(TreeNode root, Set<Integer> toDeleteSet, boolean isRoot) {
        if (root == null) return;

        boolean deleted = toDeleteSet.contains(root.val);
        if (isRoot && !deleted) {
            ans.add(root);
        }

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        if (root.left != null && toDeleteSet.contains(root.left.val)) {
            root.left = null;
        }
        if (root.right != null && toDeleteSet.contains(root.right.val)) {
            root.right = null;
        }

        dfs(leftNode, toDeleteSet, deleted);
        dfs(rightNode, toDeleteSet, deleted);
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ans = new ArrayList<>();
        Set<Integer> toDeleteSet = new HashSet<>();
        for (int val : to_delete) {
            toDeleteSet.add(val);
        }
        dfs(root, toDeleteSet, true);
        return ans;
    }
}
```
