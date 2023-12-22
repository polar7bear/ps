import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static Queue<Node> q;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int set;
    static List<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];
        result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    result.add(bfs(i, j));
                    set++;
                }
            }
        }
        System.out.println(set);
        Collections.sort(result);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int bfs(int x, int y) {
        q = new LinkedList<>();
        q.add(new Node(x, y));
        visited[x][y] = true;
        int cnt = 1;
        while (!q.isEmpty()) {
            Node now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || n <= nx || ny < 0 || n <= ny) continue;

                if (!visited[nx][ny] && graph[nx][ny] == 1) {
                    cnt++;
                    visited[nx][ny] = true;
                    q.add(new Node(nx, ny));
                }
            }
        }
        return cnt;
    }

    private static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}



