package algorithm.codingtest.boj.map_set_tree_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B14425 {
    public static void main(String[] args) throws IOException {
        //문자열 집합
        //문자열 N개가 저장되어있는 집합 S에서 입력받은 M개의 문자열들이 집합 S에 포함되어있는가? 포함된 개수를 출력
        //첫째줄에 문자열의 개수 N과 M이 주어짐
        //둘째줄부터는 N개의 문자열들 입력 그 다음은 M개의 문자열들 입력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> s = new HashSet<>();

        for(int i = 0; i < n; i++) {
            s.add(br.readLine());
        }

        int cnt = 0;

        for(int i = 0; i < m; i++) {
            String str = br.readLine();

            if(s.contains(str)) cnt++;
        }
        System.out.println(cnt);
    }
}
