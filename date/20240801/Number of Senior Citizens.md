# 2678. [Number of Senior Citizens](https://leetcode.com/problems/number-of-senior-citizens/description/?envType=daily-question&envId=2024-08-01)

## Solution

```java
class Solution {
    private static final int ELDERLY_THRESHOLD = 60;
    private static final int AGE_TENS_INDEX = 11;
    private static final int AGE_ONES_INDEX = 12;
    public int countSeniors(String[] details) {
        int elderlyCount = 0;

        for (String passengerInfo : details) {
            if (calculateAge(passengerInfo) > ELDERLY_THRESHOLD) {
                elderlyCount++;
            }
        }

        return elderlyCount;
    }

    private int calculateAge(String info) {
        int tens = charToDigit(info.charAt(AGE_TENS_INDEX));
        int ones = charToDigit(info.charAt(AGE_ONES_INDEX));
        return tens * 10 + ones;
    }

    private int charToDigit(char c) {
        return c - '0';
    }
}
```
