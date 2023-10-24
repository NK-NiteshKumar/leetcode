class LargestValues {
    public static void calc(TreeNode root,List<Integer> list,int height){
        if(root==null) return;
        int curr=root.val;
        if(list.size()==height) list.add(curr);
        else {
            if(curr>list.get(height)) {
                list.set(height,curr);
            }
        }
        calc(root.right,list,height+1);
        calc(root.left,list,height+1);
        return;
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list  = new ArrayList<>();
        calc(root,list,0);
        return list;
    }
}

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/
