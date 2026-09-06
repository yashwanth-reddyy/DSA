class Solution {
    public boolean isBipartite(int[][] graph) {
         int[] color = new int[graph.length];

        Arrays.fill(color, -1);

        for (int i = 0; i < graph.length; i++) {
            if (color[i] != -1) continue;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 0;

            while (!queue.isEmpty()) {
                int node = queue.poll();

                for (int neighbor : graph[node]) {
                    if (color[neighbor] == -1) {
                        color[neighbor] = 1 - color[node];
                        queue.offer(neighbor);
                    } else if (color[neighbor] == color[node]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}