import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();
        int num;
        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());

                switch (command) {
                    case "add":
                        set.add(num);
                        break;

                    case "remove":
                        set.remove(num);
                        break;

                    case "check":
                        sb.append(set.contains(num) ? 1 : 0).append("\n");
                        break;

                    case "toggle":
                        if (set.contains(num)) {
                            set.remove(num);
                        } else {
                            set.add(num);
                        }
                        break;
                }
            } else {
                switch (command) {
                    case "all":
                        set.clear();
                        for (int i = 1; i <= 20; i++) {
                            set.add(i);
                        }
                        break;

                    case "empty":
                        set.clear();
                        break;
                }
            }
        }
        System.out.print(sb);
    }
}