package algorithm.codingtest.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1541 {
    public static int sum(String s) {   // +는 모두 더해주기
        String[] add = s.split("\\+");
        int sum = 0;

        for (String value : add) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        //잃어버린 괄호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sub = br.readLine().split("-");

        int result = 0;

        // 55-50+40
        for (int i = 0; i < sub.length; i++) {
            int tempSum = sum(sub[i]);

            if (i == 0) {  // 첫번째 숫자는 더해준다. 55 두번째는 90
                result += tempSum;
            } else {  // 첫번째 `-` 이후의 숫자는 빼기
                result -= tempSum;
            }
        }
        System.out.println(result);
    }
}
