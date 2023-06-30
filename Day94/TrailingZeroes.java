class TrailingZeroes {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }     
        return count;
    }
}

//https://leetcode.com/problems/factorial-trailing-zeroes/
