# 3066. [Minimum Operations to Exceed Threshold Value II](https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/?envType=daily-question&envId=2025-02-13)

## Solution

```java
class Solution 
{
    public static int minOperations(int[] nums, int k) 
    {
        int operations = 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (int num : nums) 
        {
            minHeap.add((long) num);
        }

        while (minHeap.size() > 1 && minHeap.peek() < k)
        {
            long x = minHeap.poll();
            long y = minHeap.poll();
            long newVal = x * 2 + y;

            minHeap.add(newVal);
            operations++;
        }

        return minHeap.peek() >= k ? operations : -1;
    }
}
```
---
```java
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            if(num<k) pq.add(num);
        }
        int op = 0;

        while(!pq.isEmpty()){
            int x = pq.poll();
            op++;
            if(pq.isEmpty()) break;
            int y = pq.poll();
            long up = 2l * x + y;
            if(up<k) pq.add((int)up);
        }
        return op;
    }
}
```
