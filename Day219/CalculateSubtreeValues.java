class CalculateSubtreeValues {
    private int matchingSubtreeCount = 0; 

    private int[] calculateSubtreeValues(TreeNode currentNode) {
        if (currentNode == null)
            return new int[]{0, 0}; 

        int[] leftSubtree = calculateSubtreeValues(currentNode.left);
        int[] rightSubtree = calculateSubtreeValues(currentNode.right);

        int sumOfValues = leftSubtree[0] + rightSubtree[0] + currentNode.val;
        int numberOfNodes = leftSubtree[1] + rightSubtree[1] + 1;

        if (sumOfValues / numberOfNodes == currentNode.val)
            matchingSubtreeCount++;

        return new int[]{sumOfValues, numberOfNodes}; 
    }

    public int averageOfSubtree(TreeNode root) {
        calculateSubtreeValues(root);
        return matchingSubtreeCount; 
    }
}

//https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
