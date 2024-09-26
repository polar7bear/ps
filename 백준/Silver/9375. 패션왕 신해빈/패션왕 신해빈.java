import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), n;
        Map<String, Integer> map;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            int res = 1;

            while (n-- > 0) {
                String input = br.readLine();
                int idx = input.indexOf(" ");
                String key = input.substring(idx + 1);

                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            for (int val : map.values()) {
                res *= (val + 1);
            }
            sb.append(res - 1).append("\n");
        }
        System.out.println(sb);

    }
}