import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n;

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            ArrayDeque<Character> dq = new ArrayDeque<>();
            char[] ch = br.readLine().replace(" ", "").toCharArray();

            dq.addFirst(ch[0]);
            for (int i = 1; i < n; i++) {
                if (ch[i] <= dq.peekFirst()) {
                    dq.addFirst(ch[i]);
                } else {
                    dq.addLast(ch[i]);
                }
            }
            
            while (!dq.isEmpty()) {
                sb.append(dq.pollFirst());
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}