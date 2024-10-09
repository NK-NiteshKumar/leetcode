# 921. [Minimum Add to Make Parentheses Valid](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/?envType=daily-question&envId=2024-10-09)

## Solution

```java
class Solution {
    public int minAddToMakeValid(String s) {
    int open =0, mismatch=0;
    for(int i=0; i<s.length(); i++)
    {
     if(s.charAt(i)=='(')
     open++;
     else
     {
        if(open>0)
        open--;
        else
        mismatch++;
     }
    } 
     return open+mismatch;   
    }
}
```
