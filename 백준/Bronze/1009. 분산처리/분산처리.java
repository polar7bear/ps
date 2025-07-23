import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            a = a % 10;
            if (a == 0) {
                System.out.println(10);
                continue;
            }

            int res = 1;
            for (int j = 0; j < b % 4 + 4; j++) {
                res = (res * a) % 10;
            }
            System.out.println(res);
        }

    }
}