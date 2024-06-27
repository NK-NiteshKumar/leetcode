# 1791. [Find Center of Star Graph](https://leetcode.com/problems/find-center-of-star-graph/description/?envType=daily-question&envId=2024-06-27)

## Solution

```java
class Solution {
    public int findCenter(int[][] edges) {
        
        int firstEdge[] = edges[0];
        int secondEdge[] = edges[1];

        return (firstEdge[0] == secondEdge[0] || firstEdge[0] == secondEdge[1]) ? firstEdge[0] : firstEdge[1];
    }
}
```
