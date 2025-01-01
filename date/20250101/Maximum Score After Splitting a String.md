# 1422. [Maximum Score After Splitting a String](https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/?envType=daily-question&envId=2025-01-01)

## Solution

```java
class Solution {
    public int maxScore(String s) {
        int length = s.length();
        int ones = 0;
        int tmpScore = s.charAt(0) == '0' ? 1 : 0;
        int score = tmpScore;
        for (int i = 1; i < length - 1; i++) {
            if (s.charAt(i) == '0') {
                tmpScore += 1;
            } else {
                ones++;
                tmpScore -= 1;
            }

            if (tmpScore > score) {
                score = tmpScore;
            }
        }
        ones += (s.charAt(length - 1) == '1' ? 1 : 0);

        return ones + score;
    }
}
```



![image](https://github.com/user-attachments/assets/85016bc4-a4f6-4761-8baa-74f175581623)
