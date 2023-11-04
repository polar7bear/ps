package algorithm.codingtest.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10818 {
    public static void main(String[] args) throws IOException {
        //최소, 최대
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt());
    }
}
