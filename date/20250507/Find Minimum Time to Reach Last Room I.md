# 3341. [Find Minimum Time to Reach Last Room I](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i/description/?envType=daily-question&envId=2025-05-07)

## Solution

```java
class Solution {
    private static class Touple implements Comparable<Touple> {
        int time;
        int row;
        int col;

        public Touple(int t, int r, int c) {
            this.time = t;
            this.row = r;
            this.col = c;
        }

        @Override
        public int compareTo(Touple t) {
            return this.time - t.time;
        }
    }

    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] distance = new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(distance[i], Integer.MAX_VALUE);
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        Queue<Touple> pq = new PriorityQueue<>();
        pq.offer(new Touple(0,0,0));
        distance[0][0] = 0;
 
        while(!pq.isEmpty()) {
            Touple t = pq.poll();
            int time = t.time;
            int x = t.row;
            int y = t.col;
            if(x == n-1 && y == m-1) return time;

            for(int i=0;i<4;i++) {
                int dx = x + directions[i][0];
                int dy = y + directions[i][1];
                if(isValid(moveTime, dx, dy)) {
                    int nextTime = Math.max(time, moveTime[dx][dy]) + 1;
                    if(nextTime < distance[dx][dy]) {
                        distance[dx][dy] = nextTime;
                        pq.offer(new Touple(nextTime, dx, dy));
                    }
                }
            }
        }
        return -1;
    }

    private static boolean isValid(int[][] moveTime, int dx, int dy) {
        return dx >= 0 && dx < moveTime.length &&
               dy >= 0 && dy < moveTime[0].length;
    }
}
```
