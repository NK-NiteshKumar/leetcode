# 2942. [Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-05-24)

## Solution

```java
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>map=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                map.add(i);
            }
        }
        return map;
    }
}
```
