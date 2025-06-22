# 2138. [Divide a String Into Groups of Size k](https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/?envType=daily-question&envId=2025-06-22)

## Solution

```java
class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        String res[] = new String[sb.length() / k];
        for (int i = 0; i < sb.length() / k; i++) {
            res[i] = sb.substring(i * k, (i + 1) * k);
        }

        return res;
    }
}
```
