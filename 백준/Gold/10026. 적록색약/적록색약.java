import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static char[][] graph;
    static boolean[][] visited;
    static int n, oneColor, twoColor;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 접근방법
         * 적록색약인 사람은 R과 B를 같은 공간으로 간주
         * 아닌 사람은 각 색깔별로 하나의 공간으로 간주
         * 적록색약이 아닌 사람이 봤을때의 구역의 수, 적록색약인 사람이 봤을때의 구역의 수 출력
         * 두가지 경우로 나누어서 깊이우선 탐색 수행
         * flag로 true일 경우에는 적록색약인 사람을 대상으로, false일 경우에는 적록색약이 아닌 사람을 대상으로 각각 조건걸어 탐색*/

        n = Integer.parseInt(br.readLine());
        graph = new char[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        oneColor = 0;
        for (int i = 0; i < n; i++) { // 적록색약 아닌 사람
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, false);
                    oneColor++;
                }
            }
        }
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) { // 적록색약인 사람
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, true);
                    twoColor++;
                }
            }
        }
        System.out.println(oneColor + " " + twoColor);
    }

    static void dfs(int curX, int curY, boolean isTwoColor) {
        visited[curX][curY] = true;
        char curColor = graph[curX][curY];

        for (int i = 0; i < 4; i++) {
            int nx = curX + dx[i];
            int ny = curY + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

            if (!visited[nx][ny]) {
                if (isTwoColor) {
                    if ((curColor == 'R' || curColor == 'G') && (graph[nx][ny] == 'R' || graph[nx][ny] == 'G')) {
                        dfs(nx, ny, true);
                    } else if (curColor == graph[nx][ny]) {
                        dfs(nx, ny, true);
                    }
                } else {
                    if (curColor == graph[nx][ny]) dfs(nx, ny, false);
                }
            }

        }
    }
}