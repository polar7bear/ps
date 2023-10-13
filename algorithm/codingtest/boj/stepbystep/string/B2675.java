package algorithm.codingtest.boj.stepbystep.string;

import java.io.IOException;
import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) throws IOException {
        //문자열 반복
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                System.out.print(String.valueOf(s.charAt(j)).repeat(r));
            }
            System.out.println();
        }
    }
}
