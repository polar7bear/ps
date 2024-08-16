import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 1;
        int start = 2;
        int end = 7;
        for (int i = 1; i < n; i++) {
            if (start <= n && n <= end) {
                res = ++i;
                break;
            }
            start += 6 * i;
            end += 6 * (i + 1);
        }
        System.out.println(res);
    }
}