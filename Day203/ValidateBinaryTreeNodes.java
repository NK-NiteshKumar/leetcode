class ValidateBinaryTreeNodes { 
  public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
    int[] inDegree = new int[n];
    int root = -1;

    for (final int child : leftChild) {
      if (child != -1 && ++inDegree[child] == 2) {
        return false;
      }
    }

    for (final int child : rightChild) { 
      if (child != -1 && ++inDegree[child] == 2) {
        return false;
      }
    }

    for (int i = 0; i < n; ++i) {
      if (inDegree[i] == 0) {
        if (root == -1) {
          root = i;
        } else {
          return false; 
        }
      }
    }
    if (root == -1) {
      return false;
    }
    return countNodes(root, leftChild, rightChild) == n;
  }

  private int countNodes(int root, int[] leftChild, int[] rightChild) {
    if (root == -1) {
      return 0;
    }
    return 1 + 
        countNodes(leftChild[root], leftChild, rightChild) +
        countNodes(rightChild[root], leftChild, rightChild);
  }
}

//https://leetcode.com/problems/validate-binary-tree-nodes/
