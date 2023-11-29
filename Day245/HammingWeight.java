public class HammingWeight {
    public int hammingWeight(int n) {
		int setBitCount = 0;
        
		while (n != 0) {
            n &= (n - 1);
            ++setBitCount;
        }
		
        return setBitCount;
    }
}

//https://leetcode.com/problems/number-of-1-bits/
