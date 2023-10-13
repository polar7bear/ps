package algorithm.codingtest.boj.stepbystep.string;

import java.io.IOException;
import java.util.Scanner;

public class B2908 {
    //상수
    public static int reverseInt(int x) {
        int one = x % 10;
        int ten = (x / 10) % 10;
        int hundred = x / 100;

        String str = "" + one + ten + hundred;

        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int larger = Math.max(reverseInt(a), reverseInt(b));
        System.out.println(larger);
    }
}
