import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int INF = 10000000;

        int[][] cost = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(cost[i], INF);
            cost[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            cost[src][dst] = 1; // 단방향
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n; s++) {
                for (int t = 1; t <= n; t++) {
                    if (cost[s][t] > cost[s][i] + cost[i][t]) {
                        cost[s][t] = cost[s][i] + cost[i][t];
                    }
                }
            }
        }

        int res = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (cost[i][j] != INF || cost[j][i] != INF) {
                    cnt++;
                }
            }
            if (cnt == n) res++;
        }
        System.out.println(res);
    }
}