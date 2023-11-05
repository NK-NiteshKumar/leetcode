public class GetWinner {
    public int getWinner(int[] A, int k) {
        int cur = A[0];
        int win = 0;
        
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > cur) {
                cur = A[i];
                win = 0;
            }
            if (++win == k) {
                break;
            }
        }
        
        return cur;
    }
}

//https://leetcode.com/problems/find-the-winner-of-an-array-game/
