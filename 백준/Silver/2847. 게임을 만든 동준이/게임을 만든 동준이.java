import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 배열 뒤에서부터 탐색
        // 낮은레벨점수가 높은레벨점수보다 높거나 같다면 -> 낮은 레벨 점수 - 높은레벨 점수 + 1
        int res = 0;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                res += arr[i - 1] - arr[i] + 1;
                arr[i - 1] = arr[i] - 1;
            }
        }
        System.out.println(res);

    }
}