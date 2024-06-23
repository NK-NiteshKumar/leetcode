# 826. [Most Profit Assigning Work](https://leetcode.com/problems/most-profit-assigning-work/?envType=daily-question&envId=2024-06-18)

## Solution

```java
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;

        List<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{difficulty[i], profit[i]});
        }

        jobs.sort((a, b) -> a[0] - b[0]);
        Arrays.sort(worker);

        int profSum = 0;
        int maxProfit = 0;
        int j = 0;

        for (int i = 0; i < m; i++) {
            while (j < n && jobs.get(j)[0] <= worker[i]) {
                maxProfit = Math.max(maxProfit, jobs.get(j)[1]);
                j++;
            }
            profSum += maxProfit;
        }

        return profSum;
    }
}
```
