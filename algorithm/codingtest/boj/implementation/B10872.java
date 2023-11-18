package algorithm.codingtest.boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    //팩토리얼
    public static int recursive(int n) {
        if(n == 0) return 1;
        else return n * recursive(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(recursive(n));
    }
}
