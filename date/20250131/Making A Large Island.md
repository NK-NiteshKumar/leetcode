# 827. [Making A Large Island](https://leetcode.com/problems/making-a-large-island/description/?envType=daily-question\&envId=2025-01-31) 🌍🏝️

## 🚀 Solution

In this problem, we need to find the **largest possible island** by converting exactly one `0` (water) into a `1` (land). The approach involves:

1. 🏩 **Identifying all distinct islands** using Depth-First Search (DFS) and assigning unique IDs.
2. 🗂 **Storing island sizes** in a HashMap.
3. 🔄 **Evaluating potential island expansion** by flipping a single `0` and merging adjacent islands.
4. 🏆 **Returning the maximum possible island size** after the transformation.

## 💻 Implementation

```java
import java.util.*;

class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int islandId = 2;
        Map<Integer, Integer> islandSizes = new HashMap<>();
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(grid, i, j, islandId);
                    islandSizes.put(islandId++, size);
                }
            }
        }

        int maxIslandSize = islandSizes.isEmpty() ? 1 : Collections.max(islandSizes.values());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> connectedIslands = new HashSet<>();
                    int potentialSize = 1;
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] > 1) {
                            connectedIslands.add(grid[ni][nj]);
                        }
                    }
                    for (int id : connectedIslands) {
                        potentialSize += islandSizes.get(id);
                    }
                    maxIslandSize = Math.max(maxIslandSize, potentialSize);
                }
            }
        }
        return maxIslandSize;
    }

    private int dfs(int[][] grid, int x, int y, int islandId) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1) return 0;
        grid[x][y] = islandId;
        int size = 1;
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (int[] dir : directions) {
            size += dfs(grid, x + dir[0], y + dir[1], islandId);
        }
        return size;
    }
}
```

## 🤔 Complexity Analysis

- **Time Complexity:** \(O(N^2)\), since we traverse the entire grid twice (once for DFS and once for evaluating flips).
- **Space Complexity:** \(O(N^2)\), due to the storage of island sizes and visited nodes.

## 📌 Edge Cases Considered

- A grid filled with only water (`0`s). ❌💧
- A grid where all cells are land (`1`s), meaning flipping is unnecessary. ✅🏝️
- Smallest possible grids (`1x1` or `2x2`). 📏
- Scenarios where multiple islands can be merged into one large island. 🔗🏝️

**📢 Disclaimer:** This solution has been modified and enhanced by ChatGPT for improved readability and engagement. 🤖🎉

