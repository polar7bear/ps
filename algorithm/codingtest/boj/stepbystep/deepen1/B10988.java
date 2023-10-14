package algorithm.codingtest.boj.stepbystep.deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        //팰린드롬인지 확인하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        // 입력받은 s를 뒤집기 위해 StringBuilder의 reverse() 사용하기
        String b = String.valueOf(sb.append(s).reverse());

        int result = (s.equals(b)) ? 1 : 0;
        System.out.println(result);
    }
}
