import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;

        int sum = 1;
        int res = 0;
        while(start <= n) {

            if (sum < n) { // 합이 n보다 작으면 end 포인터를 증가시키고 sum에 더해줌
                end++;
                if (end > n) break;
                sum += end;
            } else if (sum == n) { // 합계가 n과 같다면 가지수 추가해주고 start 포인터를 합계에서 빼고 증감시켜서 포인터 이동
                res++;
                sum -= start++;
            } else { // 합계가 n보다 크면 start 포인터 값을 합계에서 빼고 포인터 증감
                sum -= start++;
            }
        }
        System.out.println(res);
    }
}