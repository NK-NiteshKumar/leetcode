class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        if(n /(int)n == 1){
            return true;
        }
        return false;
    }
}

//https://leetcode.com/problems/valid-perfect-square/
