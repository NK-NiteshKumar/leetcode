# 1716. [Calculate Money in Leetcode Bank](https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/?envType=daily-question&envId=2025-10-25)

## Solution

```java
class Solution {
    public int totalMoney(int n) {
        int week_count = n / 7;
        int remaining_days = n % 7;
        
        int total = ((week_count * (week_count - 1)) / 2) * 7; 
        total += week_count * 28; 
        total += ((remaining_days * (remaining_days + 1)) / 2) + (week_count * remaining_days); 
        
        return total;
    }
}
```
