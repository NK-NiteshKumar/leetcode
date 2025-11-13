# 3228. [Maximum Number of Operations to Move Ones to the End](https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/description/?envType=daily-question&envId=2025-11-13)

## Solution

```java
class Solution {
    public int maxOperations(String s) {
        int index = s.length() - 1, res = 0, running = 0;
        while(index >= 0){
            while(s.charAt(index) == '1'){
                index--;
                res += running;
                if(index < 0) return res;
            }
            while(s.charAt(index) == '0'){
                index--;
                if(index < 0) return res;
            } 
            running++;
        }
        return res;
    }
}
```
