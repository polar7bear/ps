package algorithm.codingtest.boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        //X보다 작은 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());

            if(s < x) sb.append(s).append(" ");
        }

        System.out.println(sb);
    }
}
