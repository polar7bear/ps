import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] graph;
    static int[][] cost;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        //이번에는 인접행렬

        graph = new int[n][n];
        cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
             for (int j = 0; j < n; j++) {
                 graph[i][j] = input.charAt(j) - '0';
                 cost[i][j] = Integer.MAX_VALUE;
             }
        }

        dijkstra();
        System.out.println(cost[n-1][n-1]);
    }

    static void dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new Node(0, 0, 0));
        cost[0][0] = 0;

        while (!pq.isEmpty()) {
            Node curNode = pq.poll();
            int curX = curNode.x;
            int curY = curNode.y;
            int curCost = curNode.cost;

            if (curCost > cost[curX][curY]) continue;

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];


                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

                int nCost = curCost + (graph[nx][ny] == 0 ? 1 : 0);
                if (nCost < cost[nx][ny]) {
                    cost[nx][ny] = nCost;
                    pq.add(new Node(nx, ny, nCost));
                }
            }
        }
    }

    static class Node {
        int x, y, cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}