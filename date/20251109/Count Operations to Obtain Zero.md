# 2169. [Count Operations to Obtain Zero](https://leetcode.com/problems/count-operations-to-obtain-zero/description/?envType=daily-question&envId=2025-11-09)

## Solution

```java
class Solution {
    public int countOperations(int n1, int n2) {
        int c = 0;
        while (n1 > 0 && n2 > 0) {
            c += n1 / n2;
            n1 %= n2;
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        return c;
    }
}
```
