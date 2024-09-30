import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int t, l, x, y, targetX, targetY, res;
    static int[] dx = {-1, 1, 2, 2, 1, -1, -2, -2};
    static int[] dy = {2, 2, 1, -1, -2, -2, -1, 1};
    static boolean[][] visited;
    static Deque<int[]> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (t-- > 0) {
            l = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            targetX = Integer.parseInt(st.nextToken());
            targetY = Integer.parseInt(st.nextToken());

            visited = new boolean[l][l];

            res = bfs(x, y);
            System.out.println(res);
        }
    }

    static int bfs(int x, int y) {
        visited[x][y] = true;
        q = new ArrayDeque<>();
        q.add(new int[]{x, y});
        int cnt = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] cur = q.pollFirst();

                if (cur[0] == targetX && cur[1] == targetY) {
                    return cnt;
                }

                for (int j = 0; j < 8; j++) {
                    int nx = cur[0] + dx[j];
                    int ny = cur[1] + dy[j];

                    if (nx < 0 || nx >= l || ny < 0 || ny >= l || visited[nx][ny]) continue;

                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
            cnt++;
        }
        return cnt;
    }
}