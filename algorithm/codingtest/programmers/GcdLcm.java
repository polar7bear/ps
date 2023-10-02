package algorithm.codingtest.programmers;

import java.io.IOException;
import java.util.Arrays;

public class GcdLcm {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    static int[] solution(int n, int m) {
        //n 3, m 12
        //큰 수를 작은 수로 나눈 나머지를 r이라 가정하고,
        //나머지가 0이 될때까지 n % r
        int[] answer = new int[2];
        int gcd = gcd(n, m);
        answer[0] = gcd;
        answer[1] = (n * m) / gcd;


        return answer;
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}




