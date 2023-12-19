import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(dp(n));
    }

    static int dp(int n) {
        if(n == 1) dp[n] = 1;
        if(n == 2) dp[n] = 2;
        if(dp[n] != 0) return dp[n];
        return dp[n] = (dp(n-1) + dp(n-2)) % 10007;
    }
}

