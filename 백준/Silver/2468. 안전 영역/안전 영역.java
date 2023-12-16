import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1}; //위에서부터 시계방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int max = 0;

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }

        int res = 1;
        for(int i = 0; i <= max; i++) {
            visited = new boolean[n][n];
            int safe = 0;

            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(!visited[j][k] && map[j][k] > i) {
                        dfs(j, k, i);
                        safe++;
                    }
                }
            }
            res = Math.max(res, safe);
        }
        System.out.println(res);
    }

    static void dfs(int x, int y, int h) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || n <= nx || ny < 0 || n <= ny) continue;

            if(map[nx][ny] > h && !visited[nx][ny]) {
                dfs(nx, ny, h);
            }
        }
    }
}
