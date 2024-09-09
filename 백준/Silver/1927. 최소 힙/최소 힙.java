import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0 && pq.isEmpty()) {
                System.out.println(0);
            } else if (x == 0) {
                System.out.println(pq.poll());
            } else {
                pq.add(x);
            }
        }
    }
}