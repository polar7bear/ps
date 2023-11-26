package algorithm.codingtest.boj.map_set_tree_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B10816 {
    public static void main(String[] args) throws IOException {
        //카드 게임2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());

            if (map.containsKey(key)) {
                int cnt = map.get(key);
                cnt++;
                map.put(key, cnt);
            } else {
                map.put(key, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            int findKey = Integer.parseInt(st.nextToken());

            if(map.containsKey(findKey)) {
                sb.append(map.get(findKey)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
