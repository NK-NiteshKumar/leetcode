# 869. [Reordered Power of 2](https://leetcode.com/problems/reordered-power-of-2/description/?envType=daily-question&envId=2025-08-10)

## Solution 

```java
class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortedString(n);
        for (int i = 0; i < 31; i++) {
            if (sortedString(1 << i).equals(target)) return true;
        }
        return false;
    }

    private String sortedString(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
```