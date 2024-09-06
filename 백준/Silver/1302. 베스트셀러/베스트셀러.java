import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }
        int max = 0;
        String res = "";
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = Math.max(map.get(key), max);
                res = key;
            } else if (map.get(key) == max) {
                if (key.compareTo(res) < 0) {
                    res = key;
                }
            }
        }
        System.out.println((res));
    }
}