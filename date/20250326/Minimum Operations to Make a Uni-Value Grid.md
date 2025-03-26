# 2033. [Minimum Operations to Make a Uni-Value Grid](https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/description/?envType=daily-question&envId=2025-03-26)

## Solution

```java
class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> all = new ArrayList<>();
        
        for (int[] row : grid) {
            for (int num : row) {
                all.add(num);
            }
        }
        
        int mod = all.get(0) % x;
        for (int num : all) {
            if (num % x != mod) return -1;
        }

        Collections.sort(all);
        int median = all.get(all.size() / 2);
        int operations = 0;

        for (int num : all) {
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }
}
```
