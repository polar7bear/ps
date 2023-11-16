package algorithm.codingtest.boj.implementation;

import java.io.*;
import java.util.StringTokenizer;

public class B11021 {
    public static void main(String[] args) throws IOException {
        //A + B - 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.printf("Case #%d: %d\n", i + 1, a + b);
        }
    }
}
