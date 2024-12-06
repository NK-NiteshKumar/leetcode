# 2554. [Maximum Number of Integers to Choose From a Range I](https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description/?envType=daily-question&envId=2024-12-06)

## Solution

```java
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] arr=new int[10001];
        for(int i=0; i<banned.length; i++){
            arr[banned[i]]=1;
        }

        long sum=0;
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(arr[i]==1){continue;}
            sum+=i;
            if(sum>maxSum){
               break;
            }
            cnt++;
        }

        return cnt;
    }
}
```
