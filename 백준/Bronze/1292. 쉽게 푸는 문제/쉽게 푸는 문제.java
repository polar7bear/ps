import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int idx = 0;
        int[] arr = new int[b * (b + 1) / 2];

        for (int i = 1; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                arr[idx++] = i;
            }
        }
        int res = 0;
        for (int i = a - 1; i < b; i++) {
            res += arr[i];
        }
        System.out.println(res);
    }
}