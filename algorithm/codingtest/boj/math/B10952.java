package algorithm.codingtest.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Predicate;

public class B10952 {
    public static void main(String[] args) throws IOException {
        // A + B - 5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Predicate<String> inNotZeroZero = i -> !i.equals("0 0");

        String input;

        while (inNotZeroZero.test(input = br.readLine())) {
            StringTokenizer st = new StringTokenizer(input, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);


    }
}
