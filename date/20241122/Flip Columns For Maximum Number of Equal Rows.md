# 1072. [Flip Columns For Maximum Number of Equal Rows](https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/description/?envType=daily-question&envId=2024-11-22)

## Solution

```java
class Solution {
    public int maxEqualRowsAfterFlips(int[][] mat) {
        Map<String, Integer> patFreq = new HashMap<>();
        
        for (int[] row : mat) {
            StringBuilder pattern = new StringBuilder();
            if (row[0] == 0) {
                for (int bit : row) pattern.append(bit);
            } else {
                for (int bit : row) pattern.append(bit ^ 1);
            }
            patFreq.merge(pattern.toString(), 1, Integer::sum);
        }
        
        return Collections.max(patFreq.values());
    }
}
```
