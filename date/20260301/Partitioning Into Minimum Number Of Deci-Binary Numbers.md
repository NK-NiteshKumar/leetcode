# 1689. [Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/?envType=daily-question&envId=2026-03-01)

## Solution

```java
class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        
        for(int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            
            if(digit > maxDigit) {
                maxDigit = digit;
            }
            
            if(maxDigit == 9) {
                break;
            }
        }
        
        return maxDigit;
    }
}
```

```
class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            new Solution().minPartitions("0");
        }
    }

    public int minPartitions(String n) {
        int max = -1;

        for(int i = 0; i < n.length(); i++) {
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}
```
