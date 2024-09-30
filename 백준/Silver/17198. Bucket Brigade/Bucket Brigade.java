import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] farm = new char[10][10];
    static boolean[][] visited = new boolean[10][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // B -> 불 난 헛간 R -> 바위 L -> 호수

        for (int i = 0; i < 10; i++) {
            farm[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //if (farm[i][j] == 'R') visited[i][j] = true;
                if (farm[i][j] == 'L') {
                    bfs(i, j);
                    return;
                }
            }
        }

    }

    static void bfs(int x, int y) {
        Deque<int[]> q = new ArrayDeque<>();
        visited[x][y] = true;
        q.add(new int[]{x, y, 0});

        while (!q.isEmpty()) {
            int[] cur = q.pollFirst();
            int cnt = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx < 0 || nx >= 10 || ny < 0 || ny >= 10 || visited[nx][ny] || farm[nx][ny] == 'R') continue;

                if (farm[nx][ny] == 'B') {
                    System.out.println(cnt);
                    return;
                }

                visited[nx][ny] = true;
                q.add(new int[]{nx, ny, cnt + 1});
            }
        }

    }
}