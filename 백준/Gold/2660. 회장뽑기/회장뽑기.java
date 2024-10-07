import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] cost = new int[n + 1][n + 1];
        int INF = n + 1;
        for (int i = 1; i <= n; i++) {
            Arrays.fill(cost[i], INF);
            cost[i][i] = 0;
        }
        while (true) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            if (src == -1) break;

            cost[src][dst] = 1;
            cost[dst][src] = 1; // 친구관계
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n; s++) {
                for (int t = 1; t <= n; t++) {
                    cost[s][t] = Math.min(cost[s][t], cost[s][i] + cost[i][t]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int[] score = new int[n + 1];
        int min = INF;
        // 회장후보의 점수와 회장후보 수
        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= n; j++) {
                if (i == j) continue; // 자기자신은 생략함
                max = Math.max(max, cost[i][j]);
            }
            score[i] = max;
            min = Math.min(min, score[i]);
        }
        sb.append(min).append(" ");

        int sum = 0;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (score[i] == min) {
                sum++;
                sb2.append(i).append(" ");
            }
        }
        sb.append(sum);

        System.out.println(sb);
        System.out.println(sb2);
    }
}