# 1382. [Balance a Binary Search Tree](https://leetcode.com/problems/balance-a-binary-search-tree/description/?envType=daily-question&envId=2024-06-26)

## Solution

```java
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        
        List<Integer> inorder = new ArrayList<>();
        inOrderTrav(root, inorder);
        return createBalanceBST(inorder, 0, inorder.size() - 1);
    }

    private void inOrderTrav(TreeNode root, List<Integer> inorder) {
        if(root == null) return;
        inOrderTrav(root.left, inorder);
        inorder.add(root.val);
        inOrderTrav(root.right, inorder);
    }

    private TreeNode createBalanceBST(
        List<Integer> inorder,
        int start,
        int end
    ) {
        if(start > end) return null;

        int mid = start + (end - start) / 2;

        TreeNode leftSubtree = createBalanceBST(inorder, start, mid-1);
        TreeNode rightSubtree = createBalanceBST(inorder, mid+1, end);

        TreeNode node = new TreeNode(
            inorder.get(mid),
            leftSubtree,
            rightSubtree
        );
        return node;
    }
}
```

```
![image](https://github.com/NK-NiteshKumar/leetcode/assets/104667965/6e8476c0-0773-4268-ba93-76b4321ac24d)
```
