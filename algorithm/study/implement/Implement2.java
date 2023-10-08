package algorithm.study.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implement2 {
    static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        //시각
        //입력된 n(시간)까지 1씩 증가시켜 3이 포함되면 경우의 수가 추가되게 해보자   (완전탐색)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0; //경우의 수

        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (check(h, m, s)) result++;
                }
            }
        }
        System.out.println(result);
    }
}
