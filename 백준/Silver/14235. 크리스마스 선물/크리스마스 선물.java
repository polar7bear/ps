import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());

            if (first == 0) {
                sb.append(pq.isEmpty() ? -1 : pq.poll()).append("\n");
            } else {
                while (st.hasMoreTokens()) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);

    }
}