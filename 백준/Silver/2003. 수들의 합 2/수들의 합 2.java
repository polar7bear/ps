import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int res = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end <= n) {
            if (sum < m) {
                if (end < n) {
                    sum += arr[end++];
                } else break;
            } else if (sum > m) {
                sum -= arr[start++];
            } else if (sum == m) {
                res++;
                sum -= arr[start++];
            }
        }
        if (sum == m) res++;
        System.out.println(res);
    }
}