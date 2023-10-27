package algorithm.codingtest.boj.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27433 {
    //팩토리얼2
    public static long recursion(int n) { //재귀 함수
        if(n <= 1) return 1;

        return n * recursion(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(recursion(n));
    }
}
