# 2698. [Find the Punishment Number of an Integer](https://leetcode.com/problems/find-the-punishment-number-of-an-integer/description/?envType=daily-question&envId=2025-02-15)

## Solution

```java
class Solution {
    public int punishmentNumber(int n) {
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), i)) {
                totalSum += square;
            }
        }

        return totalSum;
    }

    private boolean canPartition(String numStr, int target) {
        int length = numStr.length();
        return backtrack(numStr, target, 0, 0);
    }

    private boolean backtrack(String numStr, int target, int start, int currentSum) {
        if (currentSum > target) return false;
        if (start == numStr.length()) return currentSum == target;

        for (int end = start + 1; end <= numStr.length(); end++) {
            String partStr = numStr.substring(start, end);
            int part = Integer.parseInt(partStr);
            if (backtrack(numStr, target, end, currentSum + part)) {
                return true;
            }
        }
        return false;
    }
}
```
