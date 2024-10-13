# 632. [Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/description/?envType=daily-question&envId=2024-10-13)

## Solution

```java
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> ordered = new ArrayList<>();

        for (int k = 0; k < nums.size(); ++k) {
            for (int n : nums.get(k)) {
                ordered.add(new int[]{n, k});
            }
        }

        Collections.sort(ordered, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0, k = 0;
        int[] ans = new int[0];
        Map<Integer, Integer> count = new HashMap<>();

        for (int j = 0; j < ordered.size(); ++j) {
            if (count.getOrDefault(ordered.get(j)[1], 0) == 0) ++k;
            count.put(ordered.get(j)[1], count.getOrDefault(ordered.get(j)[1], 0) + 1);

            if (k == nums.size()) {
                while (count.get(ordered.get(i)[1]) > 1) {
                    count.put(ordered.get(i)[1], count.get(ordered.get(i)[1]) - 1);
                    ++i;
                }

                if (ans.length == 0 || ans[1] - ans[0] > ordered.get(j)[0] - ordered.get(i)[0]) {
                    ans = new int[]{ordered.get(i)[0], ordered.get(j)[0]};
                }
            }
        }

        return ans;
    }
}
```
