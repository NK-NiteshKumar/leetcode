class NumRollsToTarget {
    int[][] dp;
    int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        if (n == 0 && target == 0) 
            return 1;
        if (target < n || n * k < target) 
            return 0;
        dp = new int[n + 1][target + 1];
        return function(n, k, target);
    }
    public int function(int n, int k, int target) {
        if (n == 0 && target == 0){
            return 1;
        }
        if (target < n || n * k < target) {
            return 0;
        }
        if (dp[n][target] != 0) {
            return dp[n][target];
        }
        int res = 0;
        for (int i = 1; i <= k; i++) {
            if (target < i) break;
                res = (res + function(n - 1, k, target - i) % MOD) % MOD;
        }
        dp[n][target] = res;
        return res;
    }
}

//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
