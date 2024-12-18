# 1475. [Final Prices With a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/?envType=daily-question&envId=2024-12-18)

## Solution

```java
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = prices[i];

            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    res[i] -= prices[j];
                    break;
                }
            }
        }
        
        return res;
    }
}
```
