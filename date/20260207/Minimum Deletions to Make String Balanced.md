# 1653. [Minimum Deletions to Make String Balanced](https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/?envType=daily-question&envId=2026-02-07)

## Solution

```java
class Solution {
    public int minimumDeletions(String s) {
        int ans = 0;
        int count = 0;

        for(char ch: s.toCharArray()) {
            if(ch == 'b') {
                count += 1;
            } else if(count > 0) {
                ans+= 1;
                count -= 1;
             }
            }
           
           return ans;
        } 
    }
```
