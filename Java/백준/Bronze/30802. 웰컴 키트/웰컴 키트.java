import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int[] res = new int[6];
        for (int i = 0; i < 6; i++) arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            if (arr[i] <= t && arr[i] != 0) {
                res[i] = 1;
            } else if (arr[i] > t){
                res[i] = (arr[i] + t - 1) / t;
            }
        }
        System.out.println(Arrays.stream(res).sum());
        System.out.println((n / p) + " " + (n % p));
    }
}