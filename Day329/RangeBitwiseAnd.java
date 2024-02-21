class RangeBitwiseAnd {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
}

//https://leetcode.com/problems/bitwise-and-of-numbers-range/
