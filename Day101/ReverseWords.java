class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        for(int start = s.length()-1; start >=0 ; start--) {
            if(s.charAt(start)==' '){
                continue;
            }
            int end=start;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            ans.append(s.substring(start+1,end+1)).append(" ");
        }
        return ans.toString().strip();
    }
}

//https://leetcode.com/problems/reverse-words-in-a-string/
