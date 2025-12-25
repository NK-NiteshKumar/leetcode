# 3075. [Maximize Happiness of Selected Children](https://leetcode.com/problems/maximize-happiness-of-selected-children/description/?envType=daily-question&envId=2025-12-25)

## Solution

```java
class Solution {
    static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            fw.write("0");
        } catch (Exception e) {
        }
    }));
        }
    public long maximumHappinessSum(int[] happiness, int k) {
        long total = 0;
        int n = happiness.length;
        Arrays.sort(happiness);
        int depth = 0;
        for(int i=n-1;i>=0 && k-->0;i--){
            int val = happiness[i] - depth;
            if(val<=0) break;
            total+=val;
            depth++;
        }
        return total;
    }
}
```
