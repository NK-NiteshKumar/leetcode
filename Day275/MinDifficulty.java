class MinDifficulty {
    int n;
    int jobDifficulty[];
    int memo[][];
    public int minDifficulty(int[] jobDifficulty, int d) {
        n = jobDifficulty.length;
        this.jobDifficulty = jobDifficulty;
        memo = new int[n][d];
        if(n < d ){
            return -1;
        }
        for(int i[] : memo) {
            Arrays.fill(i, -1);
        }
        return dp(0, d-1); 
    }
    public int dp(int cur, int d) {
        if(memo[cur][d] != -1) {
            return memo[cur][d];
        }
        int ans = Integer.MAX_VALUE;
        int maxDif = -1;
        for(int i=cur; i<n-d; i++) {
            maxDif = Math.max(maxDif, jobDifficulty[i]);
            if(d == 0) {
                ans = maxDif;
            }
            if(d != 0) {
                ans = Math.min(ans, maxDif + dp(i+1, d-1));
            }
        }
        memo[cur][d] = ans;
        return ans;
    }
}

//https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/description/
