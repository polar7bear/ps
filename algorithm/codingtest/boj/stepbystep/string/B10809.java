package algorithm.codingtest.boj.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10809 {
    public static void main(String[] args) throws IOException {
        //알파벳 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        for(int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if(arr[c] == -1) arr[c] = i;
        }
        for (int j : arr) System.out.print(j + " ");
    }
}
