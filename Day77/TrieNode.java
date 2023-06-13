class TrieNode{
    boolean eow;
    TrieNode children[];
    public TrieNode(){
        eow=false;
        children=new TrieNode[256];
    }
}
class Trie {
TrieNode root;
    public Trie() {
        root=new TrieNode();
        
    }

    public void insert(String word) {
        if(word==null ||word.isEmpty()) return;
        TrieNode curr=root;
        for(int level=0;level<word.length();level++){
           int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new TrieNode();
            }
            
             curr=   curr.children[idx];
            
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
         if(word==null ||word.isEmpty()) return false;
         TrieNode curr=root;
        for(int level=0;level<word.length();level++){
           int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
              return false;
            }
            
             curr=   curr.children[idx];
            
        }
        return curr.eow;
    }
    
    public boolean startsWith(String prefix) {
        if(prefix==null||prefix.isEmpty()) 
            return false;
        TrieNode curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null) 
            {
                return false;
                }
             curr=curr.children[idx];
        }
        return true;
    }
}


//https://leetcode.com/problems/implement-trie-prefix-tree/
