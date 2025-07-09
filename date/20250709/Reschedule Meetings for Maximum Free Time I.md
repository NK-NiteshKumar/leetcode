# 3439. [Reschedule Meetings for Maximum Free Time I](https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-i/description/?envType=daily-question&envId=2025-07-09)

## Soolution

```java
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) 
    {
        int i=0;
        int j=0;
        int x=0;
        int y=0;
        int val=0;
        int count=0;
        int max=0;


        while(j<=eventTime)
        {
            
            while(y<endTime.length&&j<=eventTime&&count<k)
            {
                if(j==startTime[y])
                {
                   count++;
                   val+=(endTime[y]-startTime[y]);
                   y++;
                }
                if(y==endTime.length)
                break;
                
                  j=startTime[y];
            }
                     if(y==endTime.length)
                break;         
                max=Math.max((j-i)-val,max);
                i=endTime[x];
                val-=(endTime[x]-startTime[x]);
                x++;
                count--;
        } 
            max=Math.max((eventTime-i)-val,max);
            return max;
        }
}
```
