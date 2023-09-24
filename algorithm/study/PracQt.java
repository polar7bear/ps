package algorithm.study;

import java.io.IOException;
import java.util.Scanner;

public class PracQt {

    public void q7() throws IOException {
        /*연습문제 Q7
        1~10의 합은 (1+10) * 5와 같이 구할 수 있다. 이를 '가우스의 덧셈'이라고 하는데 이 방법을
        이용하여 1부터  n까지의 정수 합을 구하는 프로그램을 작성하세요.*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = (1 + n) * 5;
        /*
        1~10의 합 : (1+n) * 5
        1~100의 합 : (1+n) * 50
        1~n의 합 : (1+n) * n / 2
        * */
        System.out.println(sum);
    }

    public int sumof(int a, int b) {
    /*연습문제 Q8
        정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요.*/
        int sum = 0;
        if (a < b) {                            //a가 b보다 작을때
            for (int i = a; i <= b; i++) {     //a가 b보다 같거나 작을때까지 증감시킨다.
                sum += i;
            }
        } else {                               //반대경우(a가 b보다 클때)
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public void q9() throws IOException {
        /* 연습문제9
        두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요
        변수 b에 입력한 값이 a값 이하 이면 변수 b값을 다시 입력하세요. */
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("a값: ");
        a = sc.nextInt();
        do {
            System.out.print("b값: ");
            b = sc.nextInt();
            if (b <= a) {
                System.out.println("a보다 큰 값을 입력하세요.");
            }
        } while (a >= b);    //b가 a보다 작다면 b값 입력 반복

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }

    public void q10() throws IOException {
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
