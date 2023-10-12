package algorithm.codingtest.boj.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B11720 {
    public static void main(String[] args) throws IOException {
        //숫자의 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] t = br.readLine().split("");
        if(n < t.length) throw new IOException();

        int[] arr = Arrays.stream(t).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
