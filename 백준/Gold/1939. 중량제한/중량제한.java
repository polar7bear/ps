import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, res;
    static List<Islands>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        int src, dst, weight;
        int minWeight = Integer.MAX_VALUE, maxWeight = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            src = Integer.parseInt(st.nextToken());
            dst = Integer.parseInt(st.nextToken());
            weight = Integer.parseInt(st.nextToken());

            graph[src].add(new Islands(dst, weight));
            graph[dst].add(new Islands(src, weight));
            minWeight = Math.min(minWeight, weight);
            maxWeight = Math.max(maxWeight, weight);
        }
        st = new StringTokenizer(br.readLine());
        int targetSrc = Integer.parseInt(st.nextToken());
        int targetDst = Integer.parseInt(st.nextToken());

        res = bfs(targetSrc, targetDst);
        System.out.println(res);
    }


    static int bfs(int start, int end) {
        PriorityQueue<Islands> pq = new PriorityQueue<>((a, b) -> b.weight - a.weight);
        boolean[] visited = new boolean[n + 1];
        pq.add(new Islands(start, Integer.MAX_VALUE));

        while (!pq.isEmpty()) {
            Islands cur = pq.poll();
            int now = cur.dst;
            int weight = cur.weight;

            if (now == end) return weight;

            if (!visited[now]) {
                visited[now] = true;
                for (Islands next : graph[now]) {
                    pq.add(new Islands(next.dst, Math.min(weight, next.weight)));
                }
            }
        }

        return 0;
    }

    static class Islands {
        int dst, weight;

        public Islands(int dst, int weight) {
            this.dst = dst;
            this.weight = weight;
        }
    }
}