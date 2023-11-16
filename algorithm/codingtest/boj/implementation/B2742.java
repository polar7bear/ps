package algorithm.codingtest.boj.implementation;

import java.io.*;

public class B2742 {
    public static void main(String[] args) throws IOException {
        //기찍 N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
