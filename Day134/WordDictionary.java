class WordDictionary {
    boolean isLast;
    WordDictionary [] child;
    public WordDictionary() {
        this.isLast=false;
        this.child=new WordDictionary[26];
    }
    WordDictionary root;
    public void addWord(String word) {
        if(root==null) root=new WordDictionary();
        WordDictionary temp=root;
        for(char c:word.toCharArray()){
            int ind=c-'a';
            if(temp.child[ind]==null) temp.child[ind]=new WordDictionary();
            temp=temp.child[ind];
        }
        temp.isLast=true;
    }
    
    public boolean search(String word) {
        return checkWord(word,0,root);
    }
    public boolean checkWord(String word,int ind,WordDictionary temp){
        if(ind>=word.length()) return temp.isLast;
        if(temp==null) return false;
        char c=word.charAt(ind);
        if(c!='.'){
             if(temp.child[c-'a']!=null) return checkWord(word,ind+1,temp.child[c-'a']);
             else return false;
        }
        else{
            boolean b=false;
            for(int i=0;i<26;i++){
                if(temp.child[i]!=null) b= b || checkWord(word,ind+1,temp.child[i]);
            }
            return b;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

//https://leetcode.com/problems/design-add-and-search-words-data-structure/
