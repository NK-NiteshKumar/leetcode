# 2530. [Maximal Score After Applying K Operations](https://leetcode.com/problems/maximal-score-after-applying-k-operations/description/?envType=daily-question&envId=2024-10-14)

## Solution

```java
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) pq.add(num);
        long res = 0;
        while (k-- > 0) {
            int max = pq.poll();
            res += max;
            pq.add((max + 2) / 3);
        }
        return res;
    }
}
```
