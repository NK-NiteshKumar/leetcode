class MinFallingPathSum {
    public int minFallingPathSum(int[][] grid) {
        int n= grid.length;
        if(n==1){
            return grid[0][0];
        }
        int[][] dp= new int[201][201];
        for(int i=0; i<201; i++){
            Arrays.fill(dp[i],-1);
        }
        
        int ans= (int)(1e9);
        for(int i=0; i<n; i++){
            ans= Math.min(ans, solve(grid,0,i,n-1,dp));
        }
        
        return ans;
    }
    
    public int solve(int[][] grid, int i, int j, int n, int[][] dp){
        if(j<0 || j>n){
            return 0;
        }
        
        if(i==n){
            return grid[i][j];
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int ans= (int)(1e9);
        for(int k=0; k<=n; k++){
            if(k==j){
                continue;
            }
            ans= Math.min(ans, grid[i][j]+solve(grid,i+1,k,n,dp));
        }
        
        return dp[i][j]= ans;
    }
}

//https://leetcode.com/problems/minimum-falling-path-sum-ii/
