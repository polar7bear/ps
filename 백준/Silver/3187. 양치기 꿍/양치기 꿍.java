import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] farm;
    static int r, c, sumSheep, sumWolf;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        farm = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            farm[i] = br.readLine().toCharArray();
            ;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((farm[i][j] == 'k' || farm[i][j] == 'v') && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }
        System.out.println(sumSheep + " " + sumWolf);
    }

    static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new int[]{i, j});
        int sheep = 0, wolf = 0;

        if (farm[i][j] == 'v') wolf++;
        else if (farm[i][j] == 'k') sheep++;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];

                if (nx < 0 || nx >= r || ny < 0 || ny >= c || visited[nx][ny] || farm[nx][ny] == '#') continue;

                if (farm[nx][ny] == 'v') wolf++;
                else if (farm[nx][ny] == 'k') sheep++;
                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }

        if (sheep > wolf) {
            sumSheep += sheep;
        } else {
            sumWolf += wolf;
        }
    }
}