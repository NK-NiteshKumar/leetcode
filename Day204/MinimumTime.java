class MinimumTime {
    public int minimumTime(int n, int[][] prerequisites, int[] courseTimes) {
        ArrayList<Integer>[] prerequisitesGraph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            prerequisitesGraph[i] = new ArrayList<>();
        }

        for (int[] relation : prerequisites) {
            prerequisitesGraph[relation[0]].add(relation[1]);
        }

        Integer[] memo = new Integer[n + 1];
        int maxTime = 0;

        for (int course = 1; course <= n; course++) {
            maxTime = Math.max(dfs(course, memo, prerequisitesGraph, courseTimes), maxTime);
        }
        return maxTime;
    }

    private int dfs(int currentCourse, Integer[] memo, ArrayList<Integer>[] prerequisitesGraph, int[] courseTimes) {
        if (memo[currentCourse] != null) {
            return memo[currentCourse];
        }
        int max = 0;

        for (int prerequisite : prerequisitesGraph[currentCourse]) {
            max = Math.max(max, dfs(prerequisite, memo, prerequisitesGraph, courseTimes));
        }

        return memo[currentCourse] = max + courseTimes[currentCourse - 1];
    }
}

//https://leetcode.com/problems/parallel-courses-iii/
