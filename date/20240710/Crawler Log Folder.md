# 1598. [Crawler Log Folder](https://leetcode.com/problems/crawler-log-folder/description/?envType=daily-question&envId=2024-07-10)

## Solution

```java
class Solution {
    public int minOperations(String[] logs) {
        int res = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (res > 0) {
                    res--;
                }
            } else if (!log.equals("./")) {
                res++;
            }
        }

        return res;
    }
}
```
