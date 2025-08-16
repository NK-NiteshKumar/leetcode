# 1323. [Maximum 69 Number](https://leetcode.com/problems/maximum-69-number/description/?envType=daily-question&envId=2025-08-16)

## Solution

```java
class Solution {
    public int maximum69Number (int num) {
        String numb = Integer.toString(num);
        char[] digits = numb.toCharArray();
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
```
