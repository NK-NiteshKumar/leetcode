class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean nik=false;
        int ans=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                if(nik){
                    break;
                }
            }
            else{
                nik=true;
                ans++;
            }
        }
        return ans;
    }
}

//https://leetcode.com/problems/length-of-last-word/
