class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int idx = 0; idx < nums.length; idx ++){
            if (hset.contains(nums[idx])){
                return true;
            }
            hset.add(nums[idx]);
        }
        return false;
    }
}

//https://leetcode.com/problems/contains-duplicate/
