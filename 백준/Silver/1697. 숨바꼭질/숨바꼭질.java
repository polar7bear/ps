import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] graph;
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        graph = new int[100001];

        if (n == k) {
            System.out.println(0);
            System.exit(0);
        }

        bfs(n);
    }

    private static void bfs(int t) {
        Queue<Integer> q = new LinkedList<>();
        graph[t] = 1;
        q.add(t);

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i = 0; i < 3; i++) {
                int next = 0;
                if (i == 0) {
                    next = now + 1;
                } else if (i == 1) {
                    next = now - 1;
                } else {
                    next = now * 2;
                }

                if (next < 0 || next >= graph.length) continue;

                if (next == k) {
                    System.out.println(graph[now]);
                    return;
                }
                if (graph[next] == 0) {
                    graph[next] = graph[now] + 1;
                    q.add(next);
                }
            }
        }
    }
}

