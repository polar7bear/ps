import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] dp;

        while (t-- > 0) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            dp = new int[floor + 1][room + 1];

            for (int i = 1; i <= room; i++) dp[0][i] = i;

            for (int i = 1; i <= floor; i++) {
                for (int j = 1; j <= room; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
            System.out.println(dp[floor][room]);
        }
    }
}