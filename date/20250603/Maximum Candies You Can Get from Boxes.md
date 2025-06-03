# 1298. [Maximum Candies You Can Get from Boxes](https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes/description/?envType=daily-question&envId=2025-06-03)

## Solution

```java
class Solution {
    public int maxCandies(int[] status,int[] candies,int[][] keys,int[][] containedBoxes,int[] initialBoxes) {

        int count=0;
        boolean[] vis=new boolean[status.length];
        for(int v:initialBoxes){
            dfs(v,status,keys,containedBoxes,vis);
        }

        for(int i=0;i<candies.length;i++){
            if(vis[i]&&status[i]==1){
                count+=candies[i];
            }
        }
        return count;
    }

    public void dfs(int v,int[] status,int[][] keys,int[][] containedBoxes,boolean[] vis){ 

        vis[v]=true;
        for(int vKey:keys[v]){
            if(vKey==v) continue;
            status[vKey]=1;
        }

        for(int vContained:containedBoxes[v]){
            if(!vis[vContained]){
                dfs(vContained,status,keys,containedBoxes,vis);
            }
        }
    }
}
```
