class MissingNumber {
     public int missingNumber(int[] nums) {
        int n = nums.length, sum = n*(n+1)/2;
        for(int i : nums) sum -= i;
        return sum;
    }
}

//https://leetcode.com/problems/missing-number/
