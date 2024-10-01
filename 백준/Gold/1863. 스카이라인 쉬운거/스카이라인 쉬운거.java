import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int cnt = 0;
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int y = Integer.parseInt(st.nextToken());

            while (!dq.isEmpty() && dq.peekFirst() > y) {
                dq.pollFirst();
            }

            if (dq.isEmpty() || dq.peekFirst() < y) {
                dq.addFirst(y);
                if (y > 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}