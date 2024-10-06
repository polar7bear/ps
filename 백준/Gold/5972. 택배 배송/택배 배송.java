import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수

        List<Edge>[] graph = new ArrayList[n + 1];
        int[] cost = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
            cost[i] = Integer.MAX_VALUE;
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            int cow = Integer.parseInt(st.nextToken());

            graph[src].add(new Edge(dst, cow));
            graph[dst].add(new Edge(src, cow));
        }

        cost[1] = 0;

        // 비용 최소힙
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new Edge(1, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int curNode = current.to;
            int curCost = current.cost;

            if (curCost > cost[curNode]) continue;

            for (Edge edge : graph[curNode]) {
                int nextNode = edge.to;
                int nextCost = curCost + edge.cost;

                if (nextCost < cost[nextNode]) {
                    cost[nextNode] = nextCost;
                    pq.add(new Edge(nextNode, nextCost));
                }
            }
        }
        System.out.println(cost[n]);
    }

    static class Edge {
        int to, cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}