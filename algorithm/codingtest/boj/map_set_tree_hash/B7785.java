package algorithm.codingtest.boj.map_set_tree_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7785 {
    public static void main(String[] args) throws IOException {
        //회사에 있는 사람
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> name = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String officer = st.nextToken();
            String stat = st.nextToken();
            name.put(officer, stat);

            if (name.containsValue(officer)) {
                name.remove(officer);
            }
        }
        System.out.println(name);
        ArrayList<String> result = new ArrayList<>(name.keySet());
        Collections.sort(result, Collections.reverseOrder());

        for(String s : result) {
            System.out.println(s);
        }

    }
}
