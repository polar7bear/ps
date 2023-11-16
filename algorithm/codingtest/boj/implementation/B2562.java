package algorithm.codingtest.boj.implementation;

import java.io.*;
import java.util.ArrayList;

public class B2562 {
    public static void main(String[] args) throws IOException {
        //최댓값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int max = 0;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
        System.out.println(arr.indexOf(max) + 1);
    }
}
