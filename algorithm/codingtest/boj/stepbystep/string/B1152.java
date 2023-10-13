package algorithm.codingtest.boj.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
    public static void main(String[] args) throws IOException {
        //단어의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
