# 3024. [Type of Triangle](https://leetcode.com/problems/type-of-triangle/?envType=daily-question&envId=2025-05-19)

## Solution

```java
import java.util.*;

class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (set.size() == 1) return "equilateral";
        if (set.size() == 2) return "isosceles";
        return "scalene";
    }
}
```
