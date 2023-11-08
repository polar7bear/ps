package part1.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3273 {
    public static void main(String[] args) throws IOException {
        //두 수의 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] check = new boolean[1000001];
        int[] arr = new int[n];
        int res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            check[arr[i]] = true;
        }

        for (int j : arr) {
            int pairVal = x - j;
            if (0 <= pairVal && pairVal <= 1000000) {
                res += check[pairVal] ? 1 : 0;
            }
        }
        System.out.println(res / 2);
    }
}
