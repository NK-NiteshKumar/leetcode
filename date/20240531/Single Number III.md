# 260. [Single Number III](https://leetcode.com/problems/single-number-iii/description/?envType=daily-question&envId=2024-05-31)

## Solution

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        int getXor = 0;
        for (int num : nums) {
            getXor ^= num;
        }

        int lowestBit = getXor & (-getXor);

        int[] ans = new int[2];
        for (int num : nums) {
            if ((lowestBit & num) == 0) {
                ans[0] ^= num;
            } else {
                ans[1] ^= num;
            }
        }

        return ans;
    }
}
```
