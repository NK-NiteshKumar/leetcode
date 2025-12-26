# 2483. [Minimum Penalty for a Shop](https://leetcode.com/problems/minimum-penalty-for-a-shop/description/?envType=daily-question&envId=2025-12-26)

## Solution

```java
class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0, best_penalty = 0, ans = 0;
        char[] ch = customers.toCharArray();
        for(int i = 0; i < customers.length(); i++) {
            if(ch[i] == 'Y') {
                penalty--;
                if(penalty < best_penalty) {
                    best_penalty = penalty;
                    ans = i + 1;
                }
            }
            else penalty++;
        }
        return ans;
    }
}
```
