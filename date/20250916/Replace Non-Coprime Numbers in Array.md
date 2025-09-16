# 2197. [Replace Non-Coprime Numbers in Array](https://leetcode.com/problems/replace-non-coprime-numbers-in-array/description/?envType=daily-question&envId=2025-09-16)

## Solution

```java
class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b; 
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && gcd(stack.peek(), num) > 1) {
                int a = stack.pop(); 
                num = lcm(a, num);
            }
            stack.push(num);    
        }

        return new ArrayList<>(stack);
    }
}
```
