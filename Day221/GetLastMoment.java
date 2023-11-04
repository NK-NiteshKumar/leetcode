class GetLastMoment {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = Integer.MIN_VALUE;
        int rightMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < left.length; i++) {
            if (leftMax < left[i]) {
                leftMax = left[i];
            }
        }
        
        for (int i = 0; i < right.length; i++) {
            if (rightMin > right[i]) {
                rightMin = right[i];
            }
        }
        
        return Math.max(leftMax, n - rightMin);
    }
}

//https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/
