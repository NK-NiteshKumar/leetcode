class IsEvenOddTree {
  public boolean isEvenOddTree(TreeNode root) {
    var queue = new ArrayDeque<TreeNode>();
    queue.offer(root);

    var level = 0;

    while (!queue.isEmpty()) {
      var prev = level % 2 == 0 ? -1 : Integer.MAX_VALUE;

      for (var i = queue.size(); i > 0; i--) {
        var node = queue.poll();

        if (level % 2 == 0) {
          if (node.val % 2 == 0 || node.val <= prev) return false;
        } else {
          if (node.val % 2 == 1 || node.val >= prev) return false;
        }
        prev = node.val;

        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      level++;
    }
    return true;
  }
}

//https://leetcode.com/problems/even-odd-tree/
