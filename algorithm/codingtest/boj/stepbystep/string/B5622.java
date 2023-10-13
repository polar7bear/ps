package algorithm.codingtest.boj.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws IOException {
        //다이얼
        //걸리는 시간 = arr[i] + 1
        //0일때 걸리는 시간 = arr.length - 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int[] dial = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0};
        int total = 0;

        String[] strCase = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] s = br.readLine().split("");

        for (int i = 0; i < s.length; i++) {
            for(int j = 0; j < strCase.length; j++) {
                if (strCase[j].contains(s[i])) {
                    total += j + 3;
                }
            }
        }
        System.out.println(total);

    }
}
