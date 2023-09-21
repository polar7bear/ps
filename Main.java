import algorithm.study.Doit;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        * 연습문제10
        * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
        * 예를 들어 135를 입력하면 '그 수는 3자리입니다.' 라고 출력하고,
        * 1314를 입력하면 '그 수는 4자리입니다.'라고 출력합니다. */

        Scanner sc = new Scanner(System.in);

        int n; //입력된 양수
        do {
            n = sc.nextInt();
            if(n < 0) {
                System.out.println("0보다 높은 숫자를 입력해 주세요.");
            }
        } while(n <= 0);

        int no = 0; //자릿수

        while(n > 0) {
            n /= 10;
            no++;
        }
        System.out.println("그 수는 " + no + "자리입니다.");
    }
}

