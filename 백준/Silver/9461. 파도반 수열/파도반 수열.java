import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        1,2,3 번째는 1 고정
        4번째(2) = 첫번째(1) + 세번쨰(1)
        5번째(2) = 4번째(2)
        6번째(3) = 5번쨰(2) + 첫번째(1) -> 이때부터 규칙 생김
        11번째(12) = 10번째(9) + 6번째(3)
        12번째(16) = 11번째(12) + 7번째(4)
        13번째(21) = 12번쩨(16) + 8번째(5)
        14번째 = 13번째 + 9번째*/
        int t = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;
        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}