# 1304. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=daily-question&envId=2025-09-07)

## Solution

```java
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int current_index = 0;

        for (int i = 1; i <= n / 2; i++) {
            arr[current_index++] = -i;
        }

        if (n % 2 != 0) {
            arr[current_index++] = 0;
        }

        for (int i = 1; i <= n / 2; i++) {
            arr[current_index++] = i;
        }

        return arr;
    }
}
```
