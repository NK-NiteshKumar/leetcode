class MinOperations {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for (int bit = 0; bit <= 20; bit++) {
            int xorVal = 0;
            for (int el : nums) {
                int bitVal = (1 << bit) & el;
                xorVal ^= bitVal;
            }

            int kBitVal = (1 << bit) & k;
            if (xorVal != kBitVal) ans++;
        }
        return ans;
    }
}

//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
