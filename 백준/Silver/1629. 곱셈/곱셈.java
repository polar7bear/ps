import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long res = recursion(a, b, c);
        System.out.println(res);
    }

    static long recursion(long a, long b, long mod) {
        if (b == 0) {
            return 1 % mod;
        }
        long half = recursion(a, b / 2, mod);
        long res = (half * half) % mod;
        if (b % 2 == 1) {
            res = (res * (a % mod)) % mod;
        }

        return res;
    }
}