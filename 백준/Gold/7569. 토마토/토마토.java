import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int m, n, h, day;
    static int[][][] box;
    static boolean[][][] visited;
    static Deque<Tomato> q = new ArrayDeque<>();
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {-1, 1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        box = new int[h][n][m];
        visited = new boolean[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] == 1) {
                        visited[i][j][k] = true;
                        q.add(new Tomato(i, j, k));
                    } else if (box[i][j][k] == -1) {
                        visited[i][j][k] = true;
                    }
                }
            }
        }

        bfs(q);
        System.out.println(day);
    }

    static void bfs(Deque<Tomato> q) {

        while (!q.isEmpty()) {
            Tomato now = q.pollFirst();

            for (int i = 0; i < 6; i++) {
                int nz = now.z + dz[i];
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nz < 0 || nx >= n || ny >= m || nz >= h || visited[nz][nx][ny]) continue;

                visited[nz][nx][ny] = true;
                if (box[nz][nx][ny] == 0) {
                    box[nz][nx][ny] = box[now.z][now.x][now.y] + 1;
                    q.add(new Tomato(nz, nx, ny));
                }
            }
        }
        day = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (box[i][j][k] == 0) {
                        day = -1;
                        return;
                    }
                    day = Math.max(day, box[i][j][k]);
                }
            }
        }
        day -= 1;
    }

    static class Tomato {
        int z, x, y;

        public Tomato(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
}