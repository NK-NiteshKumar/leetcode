# 590. [N-ary Tree Postorder Traversal](https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-08-26)

## Solution

```java
class Solution {
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        dfs(root, res);

        return res;
    }

    private void dfs(Node root, List<Integer> res) {
        for (Node child : root.children) {
            dfs(child, res);
        }
        res.add(root.val);
    }
}
```
