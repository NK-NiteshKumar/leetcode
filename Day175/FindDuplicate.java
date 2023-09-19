class FindDuplicate {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
    return -1; 
    }
}

//https://leetcode.com/problems/find-the-duplicate-number/
