import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int el;
            
            if (!st.hasMoreTokens()) {
                switch (command) {
                    case "pop_front":
                        sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
                        break;

                    case "pop_back":
                        sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
                        break;

                    case "size":
                        sb.append(dq.size()).append("\n");
                        break;

                    case "empty":
                        sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                        break;

                    case "front":
                        sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
                        break;

                    case "back":
                        sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
                        break;
                }
            } else {
                el = Integer.parseInt(st.nextToken());
                switch (command) {
                    case "push_front":
                        dq.addFirst(el);
                        break;
                    case "push_back":
                        dq.addLast(el);
                        break;
                }
            }
        }
        System.out.print(sb);
    }
}
