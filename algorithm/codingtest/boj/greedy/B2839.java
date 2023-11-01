package algorithm.codingtest.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws IOException {
        //설탕 배달
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true) {
            // 7: X
            // 8: 5 1 3 1,
            // 9: 3 3,
            // 10: 5 2,
            // 11: 5 1 3 2
            // 12: 3 4
            // 13: 5 2 3 1
            // 14: 5 1 3 3
            // 15: 5 3
            // 16: 5 2 3 2
            // 17: 5 1 3 4
            if(n % 5 == 0) {
                cnt += n / 5;
                break;
            } else if(n < 0) {
                cnt = -1;
                break;
            }
            //5로 나누어 떨어지지 않는다면
            n -= 3;
            cnt++;
        }
        System.out.println(cnt);
    }
}
