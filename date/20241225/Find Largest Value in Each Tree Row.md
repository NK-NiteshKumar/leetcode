# 515. [Find Largest Value in Each Tree Row](https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/?envType=daily-question&envId=2024-12-25)

## Solution

```java
class Solution {
    private List<Integer> res;
    public List<Integer> largestValues(TreeNode root) {
        res = new ArrayList<>();
        dfs(root, 0);

        return res;
    }

    private void dfs(TreeNode root, int level) {
        if (root != null) {
            int val = root.val;
            
            if (res.size() == level) 
                res.add(val);
            else 
                res.set(level, Math.max(res.get(level), val));
            
            dfs(root.left, level + 1);
            dfs(root.right, level + 1);
        }
    }
}
```



![image](https://github.com/user-attachments/assets/d5482c3c-fa70-448c-85e4-e42966cf4566)
