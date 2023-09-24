package algorithm.study.greedy;

import java.io.IOException;
import java.util.Scanner;

public class Greedy3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //0의 아스키코드는 10진수 48이다.
        long result = str.charAt(0) - '0';

        for(int i = 1; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if(num <= 1 || result <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}

