package algorithm.study;

import java.io.IOException;
import java.util.Scanner;

public class Doit {

    public void ch01Ex01() throws IOException {
        //정수 3개 입력받고 3개의 중앙값 구하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid = 0;    //중앙값을 담을 변수 초기화

        if(a >= b) {
            if(c >= a) {    //a가 b이상 c 이하일때 중앙값은 a
                mid = a;
            } else if(b >= c) { // b가 a이하이고 c이상일때 중앙값은 c
                mid = b;
            } else {
                mid = c;
            }
        } else if(a > c) {
            mid = a;
        } else if(b > c) {
            mid = c;
        } else {
            mid = b;
        }
        System.out.println(mid);
    }

    public void ch01Ex07() throws IOException {
        //1부터 n까지 정수의 합 구하기
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 n까지 정수의 합 : " + sum);
    }


}
