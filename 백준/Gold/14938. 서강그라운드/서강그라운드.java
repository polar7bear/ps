import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 10000000;
    static int n, m, r;
    static int[] items;
    static int[][] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());  // 지역 수
        m = Integer.parseInt(st.nextToken());  // 수색 범위
        r = Integer.parseInt(st.nextToken());  // 길의 개수
        items = new int[n + 1];
        cost = new int[n + 1][n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) cost[i][j] = 0;
                else cost[i][j] = INF;
            }
        }

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            cost[a][b] = l;
            cost[b][a] = l;
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n; s++) {
                for (int t = 1; t <= n; t++) {
                    cost[s][t] = Math.min(cost[s][t], cost[s][i] + cost[i][t]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                if (cost[i][j] <= m) {
                    sum += items[j];
                }
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}