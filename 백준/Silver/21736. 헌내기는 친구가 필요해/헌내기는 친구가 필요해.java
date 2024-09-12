import com.sun.source.tree.IfTree;

import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] campus;
    static boolean[][] visited;
    static int n, m, res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        res = 0;
        campus = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            campus[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (campus[i][j] == 'I') {
                    dfs(i, j);
                }
            }
        }
        System.out.println(res == 0 ? "TT" : res);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

            if (!visited[nx][ny]) {
                if (campus[nx][ny] == 'O') {
                    dfs(nx, ny);
                } else if (campus[nx][ny] == 'P') {
                    res++;
                    dfs(nx, ny);
                }
            }
        }
    }
}