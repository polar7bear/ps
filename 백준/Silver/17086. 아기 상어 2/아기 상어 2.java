import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



class Main {
    static int n, m;
    static int[][] square;
    static boolean[][] visited;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};   //위에서부터 시계방향
    static Queue<Pointer> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        square = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
                if (square[i][j] == 1) {
                    q.add(new Pointer(i, j));
                    visited[i][j] = true;
                }
            }
        }

        int res = bfs();
        System.out.println(res);


    }

    static int bfs() {

        int max = 0;

        while (!q.isEmpty()) {
            Pointer now = q.poll();

            for (int i = 0; i < dx.length; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || n <= nx || ny < 0 || m <= ny) continue;

                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    square[nx][ny] = square[now.x][now.y] + 1;
                    max = Math.max(max, square[nx][ny]);
                    q.add(new Pointer(nx, ny));
                }
            }
        }
        return max - 1;
    }

    static class Pointer {
        int x, y;

        public Pointer(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
