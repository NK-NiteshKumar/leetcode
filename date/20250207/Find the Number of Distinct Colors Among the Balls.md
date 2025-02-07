# 3160. [Find the Number of Distinct Colors Among the Balls](https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/description/?envType=daily-question&envId=2025-02-07)

## Solution

```java
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> node = new HashMap<>();
        Map<Integer, Integer> color = new HashMap<>();
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];

            if (node.containsKey(x)) {
                int prevColor = node.get(x);
                if (prevColor == y) { 
                    ans[i] = color.size(); 
                    continue;
                }
                if (color.get(prevColor) == 1) 
                    color.remove(prevColor);
                else 
                    color.put(prevColor, color.get(prevColor) - 1);
            }

            node.put(x, y);
            color.put(y, color.getOrDefault(y, 0) + 1);
            ans[i] = color.size();
        }

        return ans;
    }
}
```
