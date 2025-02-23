# 889. [Construct Binary Tree from Preorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/?envType=daily-question&envId=2025-02-23)

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
    int preIdx, postIdx;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root=new TreeNode(preorder[preIdx]);
        preIdx++;
        
        if(root.val!=postorder[postIdx]){
            root.left=constructFromPrePost(preorder,postorder);
        }

        if(root.val!=postorder[postIdx]){
            root.right=constructFromPrePost(preorder,postorder);
        }

        postIdx++;

        return root;
    }
}
```
