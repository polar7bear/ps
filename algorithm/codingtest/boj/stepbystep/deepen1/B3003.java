package algorithm.codingtest.boj.stepbystep.deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B3003 {
    public static void main(String[] args) throws IOException {
        //킹, 퀸, 룩, 비숍, 나이트, 폰
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = Arrays.stream(s)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] ex = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < arr.length; i++) {
            System.out.print(ex[i] - arr[i] + " ");
        }
    }
}
