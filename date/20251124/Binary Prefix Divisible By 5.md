# 1018. [Binary Prefix Divisible By 5](https://leetcode.com/problems/binary-prefix-divisible-by-5/description/?envType=daily-question&envId=2025-11-24)

## Solution

```java
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int msb=0;
        for(int x: nums){
            msb=((msb<<1)+x)%5;
            ans.add(msb==0);
        }
        return ans;
    }
}
```
