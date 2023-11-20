package algorithm.codingtest.boj.implementation;

import java.util.Scanner;

public class B10817 {
    //세 수
    public static int findSecondLargest(int A, int B, int C) {
        if ((A >= B && A <= C) || (A >= C && A <= B)) {
            return A;
        } else if ((B >= A && B <= C) || (B >= C && B <= A)) {
            return B;
        } else {
            return C;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result = findSecondLargest(A, B, C);
        System.out.println(result);
    }
}