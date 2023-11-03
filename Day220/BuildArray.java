class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int temp = 0;
        int i = 1;

        while (temp < target.length) {
            if (target[temp] == i) {
                ans.add("Push");
                temp++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            i++;
        }
        return ans;
    }
}


//https://leetcode.com/problems/build-an-array-with-stack-operations/
