import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, l, r, res;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        graph = new int[n][n];
        res = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            boolean moved = false;
            visited = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && bfs(i, j)) {
                        moved = true;
                    }
                }
            }

            if (!moved) {
                break;
            }
            res++;
        }
        System.out.println(res);
    }

    private static boolean bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        List<int[]> countries = new ArrayList<>();
        visited[x][y] = true;
        q.add(new int[]{x, y});
        countries.add(new int[]{x, y});

        int sum = graph[x][y];
        int cnt = 1;
        while (!q.isEmpty()) {
            int[] now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || n <= nx || ny < 0 || n <= ny || visited[nx][ny]) continue;
                int countryDiff = Math.abs(graph[now[0]][now[1]] - graph[nx][ny]);
                if (l <= countryDiff && countryDiff <= r) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    countries.add(new int[]{nx, ny});
                    sum += graph[nx][ny];
                    cnt++;
                }
            }
        }

        if (cnt > 1) {
            int avg = sum / cnt;

            for (int[] country : countries) {
                graph[country[0]][country[1]] = avg;
            }
            return true;
        }
        return false;
    }
}



