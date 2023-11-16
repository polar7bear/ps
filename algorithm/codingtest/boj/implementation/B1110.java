package algorithm.codingtest.boj.implementation;

import java.io.*;

public class B1110 {
    public static void main(String[] args) throws IOException {
        //더하기 사이클
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        int res = n;

        while(true) {
            int one = n % 10;
            int ten = n / 10;
            n = one * 10 + (one + ten) % 10;
            cnt++;
            if(n == res) break;
        }
        System.out.println(cnt);
    }
}
