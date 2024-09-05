import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 1000; i++) {
            dp[i] = i % 2 == 0 ? dp[i-1] + dp[i / 2] : dp[i-1];
        }
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
