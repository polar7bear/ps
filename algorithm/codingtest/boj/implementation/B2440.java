package algorithm.codingtest.boj.implementation;

import java.util.Scanner;

public class B2440 {
    public static void main(String[] args) {
        //별 찍기 - 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
