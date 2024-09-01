# 2022. [Convert 1D Array Into 2D Array](https://leetcode.com/problems/convert-1d-array-into-2d-array/description/?envType=daily-question&envId=2024-09-01)

## Solution

```java
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length){
            return new int[0][0];
        }
        int[][] arr = new int[m][];

        for(int i=0; i<m; i++){
           arr[i] = Arrays.copyOfRange(original, i*n, i*n+n);
        }
        return arr;
    }
}
```
