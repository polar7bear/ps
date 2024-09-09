import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0 && pq.isEmpty()) {
                sb.append(0).append("\n");
            } else if (x == 0) {
                sb.append(pq.poll()).append("\n");
            } else {
                pq.add(x);
            }
        }
        System.out.println(sb);
    }
}