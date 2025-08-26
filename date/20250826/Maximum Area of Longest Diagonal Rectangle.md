# 3000. [Maximum Area of Longest Diagonal Rectangle](https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-08-26)

## Solution

```java
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonalSquare = 0;
        int maxRectArea = 0;
        for (int[] dimension : dimensions) {
            int diagonalSquareArea = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            if (maxDiagonalSquare == diagonalSquareArea) {
                int rectArea = dimension[0] * dimension[1];
                if (maxRectArea <= rectArea) {
                    maxRectArea = rectArea;
                    maxDiagonalSquare = diagonalSquareArea;
                }
            }
            if(maxDiagonalSquare < diagonalSquareArea) {
                maxRectArea =  dimension[0] * dimension[1];
                maxDiagonalSquare = diagonalSquareArea;
            }
        }
        return maxRectArea;
    }
}
```
