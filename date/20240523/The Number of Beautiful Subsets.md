# 2597. [The Number of Beautiful Subsets](https://leetcode.com/problems/the-number-of-beautiful-subsets/description/?envType=daily-question&envId=2024-05-23)

## Solution
```java
public class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int totCount = 1;
        Map<Integer, Map<Integer, Integer>> freqMap = new HashMap<>();

        for (int num : nums) {
            int remainder = num % k;
            freqMap.putIfAbsent(remainder, new HashMap<>());
            freqMap.get(remainder).put(num, freqMap.get(remainder).getOrDefault(num, 0) + 1);
        }

        for (Map<Integer, Integer> fr : freqMap.values()) {
            int n = fr.size();
            int currCount = 1;
            int next1 = 1;
            int next2 = 0;
            List<Map.Entry<Integer, Integer>> subsets = new ArrayList<>(fr.entrySet());
            subsets.sort(Map.Entry.comparingByKey());

            for (int i = n - 1; i >= 0; i--) {
                int skip = next1;

                int take = (1 << subsets.get(i).getValue()) - 1;

                if (i + 1 < n && subsets.get(i + 1).getKey() - subsets.get(i).getKey() == k) {
                    take *= next2;
                } else {
                    take *= next1;
                }

                currCount = skip + take;
                next2 = next1;
                next1 = currCount;
            }

            totCount *= currCount;
        }

        return totCount - 1;
    }
}
```
