package algorithm.codingtest.boj.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {
    static int n, m, v;
    static int[][] graph;
    static boolean[] visited;
    static StringTokenizer st;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        //DFS와 BFS
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken()); //정점의 개수
        m = Integer.parseInt(st.nextToken()); //간선의 개수
        v = Integer.parseInt(st.nextToken()); //시작 정점 번호

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            graph[src][dst] = 1;
            graph[dst][src] = 1;
        }

        dfs(v);
        visited = new boolean[n + 1];
        System.out.println();
        bfs(v);
    }

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for(int i = 1; i <= n; i++) {
            if(graph[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int node) {
        q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");
            for(int i = 1; i <= n; i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
