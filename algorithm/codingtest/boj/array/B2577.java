package algorithm.codingtest.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
    public static void main(String[] args) throws IOException {
        //숫자의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String multi = String.valueOf(a * b * c);

        int[] numCheck = new int[10];

        for (int i = 0; i < multi.length(); i++) {
            int j = Integer.parseInt(String.valueOf(multi.charAt(i)));
            numCheck[j]++;
        }
        for (int i : numCheck) System.out.println(i);
    }
}
