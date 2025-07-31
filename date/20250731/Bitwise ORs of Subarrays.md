# 898. [Bitwise ORs of Subarrays](https://leetcode.com/problems/bitwise-ors-of-subarrays/description/?envType=daily-question&envId=2025-07-31)

## Solution

```java
import java.util.*;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for (int num : arr) {
            Set<Integer> next = new HashSet<>();
            next.add(num);
            for (int x : cur) {
                next.add(x | num);
            }
            cur = next;
            res.addAll(cur);
        }
        return res.size();
    }
}
```

<img width="360" height="360" alt="image" src="https://github.com/user-attachments/assets/9361b657-4d98-41ef-aaa4-efc18a6f2f68" />
