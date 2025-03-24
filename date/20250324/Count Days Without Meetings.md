# 3169. [Count Days Without Meetings](https://leetcode.com/problems/count-days-without-meetings/description/?envType=daily-question&envId=2025-03-24)

## Solution

```java
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int prevEnd = 0;

        for (int[] meeting : meetings) {
            int start = Math.max(meeting[0], prevEnd + 1);
            int length = meeting[1] - start + 1;
            days -= Math.max(length, 0);
            prevEnd = Math.max(prevEnd, meeting[1]);
        }

        return days;
    }
}
```
