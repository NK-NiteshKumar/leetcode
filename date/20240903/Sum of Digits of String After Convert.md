# 1945. [Sum of Digits of String After Convert](https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/?envType=daily-question&envId=2024-09-03)

## Solution

```java
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder number = new StringBuilder();
        for (char x : s.toCharArray()) {
            number.append(x - 'a' + 1);
        }
        
        while (k > 0) {
            int temp = 0;
            for (char x : number.toString().toCharArray()) {
                temp += x - '0'; 
            }
            number = new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(number.toString());
    }
}
```
