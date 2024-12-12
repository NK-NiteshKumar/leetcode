# 2558. [Take Gifts From the Richest Pile](https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/?envType=daily-question&envId=2024-12-12)

## Solution

```java
class Solution {
    public long pickGifts(int[] g, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : g)
            maxHeap.add(val);

        for (int i = 0; i < k && maxHeap.peek() > 1; i++) {
            int x = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(x));
        }

        long sum = 0;
        for (int val : maxHeap)
            sum += val;

        return sum;
    }
}
```
