package algorithm.codingtest.boj.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11718 {
    public static void main(String[] args) throws IOException {
        //그대로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while (true) {
            s = br.readLine();
            if (s == null || s.isEmpty()) break;
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }
}
