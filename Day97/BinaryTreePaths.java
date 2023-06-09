class BinaryTreePaths {
    
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
            return null;
        
        int len = sb.length();
        sb.append(root.val);
        
        
        if(root.left==null && root.right==null){
            list.add(sb.toString());
        }else{
            sb.append("->");
            binaryTreePaths(root.left);
            binaryTreePaths(root.right);
        }
        
        sb.setLength(len);
        
        return list;
    }
}

//https://leetcode.com/problems/binary-tree-paths/
