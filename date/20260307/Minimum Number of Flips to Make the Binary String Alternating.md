# 1888. [Minimum Number of Flips to Make the Binary String Alternating](https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/description/?envType=daily-question&envId=2026-03-07)

## Solution

```java
class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String t = s + s;

        int ans = n;
        int mis0 = 0;

        for(int i = 0; i < 2*n; i++){

            char expected = (i % 2 == 0) ? '0' : '1';

            if(t.charAt(i) != expected) mis0++;

            if(i >= n){
                int left = i - n;
                char expLeft = (left % 2 == 0) ? '0' : '1';
                if(t.charAt(left) != expLeft) mis0--;
            }

            if(i >= n - 1){
                int mis1 = n - mis0;
                ans = Math.min(ans, Math.min(mis0, mis1));
            }
        }

        return ans;
    }
}
```
