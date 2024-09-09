import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Map<String, Integer> map;
        StringTokenizer st;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            int res = 1;
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                String value = st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            for (int count : map.values()) res *= (count + 1);

            System.out.println(res-1);
        }
    }
}