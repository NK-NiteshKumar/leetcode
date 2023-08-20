class IsPowerOfFour {
    public boolean isPowerOfFour(int n) {
        while(n>=4) {
            if(n%4 != 0) return false;
            n/=4;
        }
        return n==1;
    }
}

//https://leetcode.com/problems/power-of-four/submissions/
//https://leetcode.com/problems/power-of-four/submissions/1026894904/
