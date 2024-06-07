# 648. [Replace Words](https://leetcode.com/problems/replace-words/description/?envType=daily-question&envId=2024-06-07)
## Solution
```java
class TrieNode {
    char node;
    Map<Character, TrieNode> child;
    boolean isEnd;

    TrieNode(char node) {
        this.node = node;
        this.child = new HashMap<>();
        this.isEnd = false;
    }
}

class Solution {
    private TrieNode root;

    private void buildTrie(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            cur.child.putIfAbsent(c, new TrieNode(c));
            cur = cur.child.get(c);
        }
        cur.isEnd = true;
    }

    private String queryTrie(String word) {
        TrieNode cur = root;
        StringBuilder s = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (!cur.child.containsKey(c)) return word;
            cur = cur.child.get(c);
            s.append(c);
            if (cur.isEnd) return s.toString();
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode('/');
        for (String word : dictionary) {
            buildTrie(word);
        }

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            ans.append(queryTrie(words[i]));
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
```
