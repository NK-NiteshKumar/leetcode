class ConvertToTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = (n-1)%26;
            sb.append((char)('A' + rem));
            n = (n-1)/26;
        }
        sb.reverse();
        return sb.toString();
    }
}

//https://leetcode.com/problems/excel-sheet-column-title/
