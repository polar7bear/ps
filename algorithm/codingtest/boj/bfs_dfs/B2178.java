package algorithm.codingtest.boj.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {
    static int n, m;
    static int[][] maze;
    static int[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        //미로 탐색
        //(1, 1)에서 (N, M)으로 이동할 때 지나야 하는 최소의 칸 수 구하기
        //1은 이동할 수 있는 칸 (간선이 연결되어 있는 정점)
        //0은 이동할 수 없는 칸
        //시작 위치와 도착 위치도 카운트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n + 1][m + 1];
        visited = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                maze[i][j] = s.charAt(j - 1) - '0';
            }
        }

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(1, 1));
        visited[1][1] = 1;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx <= 0 || n < nx || ny <= 0 || m < ny) continue;

                if (maze[nx][ny] == 1 && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[now.x][now.y] + 1;
                    q.add(new Point(nx, ny));
                }
            }
        }
        System.out.println(visited[n][m]);
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
