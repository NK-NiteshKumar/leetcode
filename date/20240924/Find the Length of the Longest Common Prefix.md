# 3043. [Find the Length of the Longest Common Prefix](https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/description/?envType=daily-question&envId=2024-09-24)

## Solution

```java
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<String, Integer> prefixMap = new HashMap<>();
        
        for (int num : arr1) {
            String strNum = Integer.toString(num);
            String prefix = "";
            for (char ch : strNum.toCharArray()) {
                prefix += ch;
                prefixMap.put(prefix, prefixMap.getOrDefault(prefix, 0) + 1);
            }
        }
        
        int maxLength = 0;
        
        for (int num : arr2) {
            String strNum = Integer.toString(num);
            String prefix = "";
            for (char ch : strNum.toCharArray()) {
                prefix += ch;
                if (prefixMap.containsKey(prefix)) {
                    maxLength = Math.max(maxLength, prefix.length());
                }
            }
        }
        
        return maxLength;
    }
}
```
