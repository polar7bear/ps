import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, connected;
    static int[][] graph;
    static boolean[] visited;
    static Queue<Integer> q;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        connected = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= connected; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            graph[src][dst] = 1;
            graph[dst][src] = 1; //서로 연결되어 있음을 1로 표시
        }
        System.out.println(bfs(1));
    }

    private static int bfs(int num) {
        q = new LinkedList<>();
        visited[num] = true;
        q.add(num);
        int cnt = 0;
        while(!q.isEmpty()) {
            int current = q.poll();

            for(int i = 1; i <= n; i++) {
                if(graph[current][i] == 1 && !visited[i]) {
                    cnt++;
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return cnt;
    }
}



