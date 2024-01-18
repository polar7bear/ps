import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int[] distance;
    static int n, x, y, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        distance = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph[parent][child] = 1;
            graph[child][parent] = 1;
        }
        System.out.println(bfs(x, y));
    }

    private static int bfs(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == y) {
                return distance[now];
            }

            for (int i = 1; i <= n; i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    distance[i] = distance[now] + 1;
                }
            }
        }
        return -1;
    }
}
