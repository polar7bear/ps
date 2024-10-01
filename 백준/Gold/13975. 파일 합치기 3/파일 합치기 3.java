import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int k;
        long sum;
        PriorityQueue<Long> pq;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            sum = 0;
            pq = new PriorityQueue<>();
            for (int i = 0; i < k; i++) {
                pq.add(Long.parseLong(st.nextToken()));
            }

            if (k == 1) {
                sb.append(0).append("\n");
                continue;
            }


            while (pq.size() > 1) {
                long file = pq.poll() + pq.poll();
                sum += file;

                pq.add(file);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}