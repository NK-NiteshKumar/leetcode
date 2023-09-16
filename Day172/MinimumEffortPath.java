class MinimumEffortPath {
    private int[][] effort = new int[105][105]; 
    private int[] dx = {0, 1, -1, 0}; 
    private int[] dy = {1, 0, 0, -1};

    private int dijkstra(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(-a[0], -b[0]));
        pq.add(new int[]{0, 0, 0}); 
        effort[0][0] = 0; 

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = -current[0]; 

            int x = current[1];
            int y = current[2];

            if (cost > effort[x][y])
                continue;

            if (x == rows - 1 && y == cols - 1)
                return cost;

            for (int i = 0; i < 4; i++) {
                int new_x = x + dx[i];
                int new_y = y + dy[i];

                if (new_x < 0 || new_x >= rows || new_y < 0 || new_y >= cols)
                    continue;

                int new_effort = Math.max(effort[x][y], Math.abs(heights[x][y] - heights[new_x][new_y]));

                if (new_effort < effort[new_x][new_y]) {
                    effort[new_x][new_y] = new_effort;
                    pq.add(new int[]{-new_effort, new_x, new_y});
                }
            }
        }
        return effort[rows - 1][cols - 1];  
    }

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        for (int i = 0; i < rows; i++) {
            Arrays.fill(effort[i], Integer.MAX_VALUE);
        }

        return dijkstra(heights); 
    }
}

//https://leetcode.com/problems/path-with-minimum-effort/
