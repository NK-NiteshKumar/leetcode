# 2873. [Maximum Value of an Ordered Triplet I](https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/?envType=daily-question&envId=2025-04-02)

## Solution

```java
class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTriplet = 0, maxElement = 0, maxDiff = 0;
        for (int num : nums) {
            maxTriplet = Math.max(maxTriplet, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxElement - num);
            maxElement = Math.max(maxElement, num);
        }
        return maxTriplet;
    }
}
```
