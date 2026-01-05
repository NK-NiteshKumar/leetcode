# 1975. [Maximum Matrix Sum](https://leetcode.com/problems/maximum-matrix-sum/description/?envType=daily-question&envId=2026-01-05)

## Solution

```java
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;

        int leastElement = 100001;
        long sum = 0L;
        int negativeCount = 0;

        for(int[] rows : matrix ){
            for(int value : rows){
                if(value < 0){
                    negativeCount++;
                    value = -value;
                }

                sum += value;
                if(value < leastElement){
                    leastElement = value;
                }
                
            }
        }

        return (negativeCount%2 == 0) ? sum : (sum - 2*leastElement);
    }
}
```
