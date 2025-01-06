# 1769. [Minimum Number of Operations to Move All Balls to Each Box](https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/?envType=daily-question&envId=2025-01-06)

## Solution

```java
class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        
        int[] arrBox=new int[n];
        for(int i=0; i<n; i++){
            arrBox[i]=boxes.charAt(i)-'0';
        }

        int[] res=new int[n]; 

        int oneCntL=0, cumSumL=0;
        int oneCntR=0, cumSumR=0;
        int i=0, j=n-1;
        while(i<n && j>=0){
            res[i]+=cumSumL;
            oneCntL+=arrBox[i];
            cumSumL+=oneCntL;
            i++;

            res[j]+=cumSumR;
            oneCntR+=arrBox[j];
            cumSumR+=oneCntR;
            j--;
        }


        return res;
    }
}
```
