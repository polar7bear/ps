package algorithm.codingtest.boj.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args) throws IOException {
        //문자열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String s = br.readLine();
            sb.append(s.charAt(0) + "");
            sb.append(s.charAt(s.length() - 1) + "\n");
        }
        System.out.println(sb);
    }
}
