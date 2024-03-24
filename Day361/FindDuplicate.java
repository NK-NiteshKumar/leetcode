class FindDuplicate {
    public int findDuplicate(int[] nums) {
        boolean[] taken = new boolean[nums.length];
    for (int num : nums) {
      if (taken[num]) {
        return num;
      }
      taken[num] = true;
    }
    return 0;
    }
}

//https://leetcode.com/problems/find-the-duplicate-number/
