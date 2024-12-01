# 1346. [Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/description/?envType=daily-question&envId=2024-12-01)

## Solution

```java
public class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
```
