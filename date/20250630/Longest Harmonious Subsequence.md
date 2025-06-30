# 594. [Longest Harmonious Subsequence](https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=daily-question&envId=2025-06-30)

## Solution

```java
class Solution {
  public int findLHS(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    int ans = 0;
    for (int key : freq.keySet()) {
      if (freq.containsKey(key + 1)) {
        ans = Math.max(ans, freq.get(key) + freq.get(key + 1));
      }
    }
    return ans;
  }
}
```
