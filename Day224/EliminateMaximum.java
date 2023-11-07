class EliminateMaximum {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        if (n == 1)  return 1;
        int[] counts = new int[n + 1];
        for (int i = n - 1; i >= 0; i--)
            counts[Math.min(n, (dist[i] - 1) / speed[i])]++;
        
        int sum = 0;
        for (int i = 0; i < n; ) {
            sum += counts[i++];
            if (sum > i)  return i;
        }
        return n;
    }
}

//https://leetcode.com/problems/eliminate-maximum-number-of-monsters/
