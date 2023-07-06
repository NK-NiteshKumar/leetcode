class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String alph[]=new String[26];
        String arr[]=s.split(" ",0);
        if(arr.length!=pattern.length())return false;
        Set<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(alph[pattern.charAt(i)-'a']==null){
                if(set.contains(arr[i]))return false;
                alph[pattern.charAt(i)-'a']=arr[i];
                set.add(arr[i]);
            }
            else{
                if(!alph[pattern.charAt(i)-'a'].equals(arr[i]))return false;
            } 
        }
        return true;
    }
}

//https://leetcode.com/problems/word-pattern/
