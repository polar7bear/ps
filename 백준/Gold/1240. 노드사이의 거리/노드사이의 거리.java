import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static List<int[]>[] graph;
    static boolean[] visited;
    static int n, m, res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[u].add(new int[]{v, cost});
            graph[v].add(new int[]{u, cost});
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            visited = new boolean[n + 1];
            res = 0;
            dfs(start, end, 0);
            System.out.println(res);
        }
    }

    private static void dfs(int cur, int target, int cost) {
        if (cur == target) {
            res = cost;
            return;
        }

        visited[cur] = true;

        for (int[] next : graph[cur]) {
            if (!visited[next[0]]) {
                dfs(next[0], target, cost + next[1]);
            }
        }
    }
}