class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        return ((n&n-1) == 0);
    }
}

//https://leetcode.com/problems/power-of-two/
