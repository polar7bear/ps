package algorithm.codingtest.boj.math;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class B10950 {
    public static void main(String[] args) throws IOException {
        // A + B - 3
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        IntStream.rangeClosed(1, t)
                .forEach(i -> {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    sb.append(a + b).append("\n");
                });
        sc.close();
        System.out.println(sb);
    }
}
