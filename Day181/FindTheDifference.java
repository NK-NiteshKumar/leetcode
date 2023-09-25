class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int num = 0;
        for(int ch : t.toCharArray()) {
            num += ch;
        }
        for(int ch : s.toCharArray()) {
            num -= ch;
        }
        return (char) (num);
    }
}

//https://leetcode.com/problems/find-the-difference/
