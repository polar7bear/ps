package algorithm.codingtest.boj.stepbystep.deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {
    public static void main(String[] args) throws IOException {
        //그룹 단어 체커
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] bool = new boolean[26];   //알파벳 개수만큼
            boolean check = true;   //제일 처음 들어가는 문자는 무조건 true

            for (int j = 0; j < s.length(); j++) {
                int idx = s.charAt(j) - 97;
                if (bool[idx]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        check = false;
                        break;
                    }
                } else {
                    bool[idx] = true;
                }
            }
            if (check) cnt++;
        }
        System.out.println(cnt);
    }
}
