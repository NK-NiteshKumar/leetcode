class ContainsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=i+indexDiff;j++){
                if(j<nums.length)
                    if(Math.abs(nums[i]-nums[j]) <= valueDiff)return true;
            }
        }
        return false;
    }
}

//https://leetcode.com/problems/contains-duplicate-iii/
