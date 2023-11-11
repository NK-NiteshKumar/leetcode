class Graph {
    private List<List<Pair>> graph;
    public Graph(int n, int[][] edges) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            addEdge(edge);
        }
    }

    public void addEdge(int[] edge) {
        int u = edge[0];
        int v = edge[1];
        int w = edge[2];

        graph.get(u).add(new Pair(v, w));
    }

    public int shortestPath(int node1, int node2) {
        int[] dist = new int[graph.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<Pair> minHeap = new PriorityQueue<>(Comparator.comparingInt(p -> p.cost));
        dist[node1] = 0;
        minHeap.add(new Pair(node1, dist[node1]));

        while (!minHeap.isEmpty()) {
            Pair currentPair = minHeap.poll();
            int currentNode = currentPair.ep; 

            if (dist[currentNode] < currentPair.cost) {
                continue;
            }

            for (Pair neighbor : graph.get(currentNode)) {
                int newCost = dist[currentNode] + neighbor.cost;

                if (newCost < dist[neighbor.ep]) {
                    dist[neighbor.ep] = newCost;
                    minHeap.add(new Pair(neighbor.ep, newCost));
                }
            }
        }

        return dist[node2] == Integer.MAX_VALUE ? -1 : dist[node2];
    }
}

class Pair{
    int ep;
    int cost;
    public Pair(int ep, int cost){
        this.ep = ep;
        this.cost = cost;
    }
}

//https://leetcode.com/problems/design-graph-with-shortest-path-calculator/
