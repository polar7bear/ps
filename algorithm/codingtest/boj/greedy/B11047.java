package algorithm.codingtest.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047 {
    public static void main(String[] args) throws IOException {
        //동전 0
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];

        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;    //동전의 개수

        //가지고 있는 동전의 종류 중 가장 높은 동전부터 k를 나눔
        for (int i = coin.length - 1; i >= 0; i--) {
            // 만약 k가 7500이고 동전의 종류가 100, 500, 1000, 5000, 10000 이라면
            //7500 / 5000 = 1, 2500 / 1000 = 2(밑의 나머지 연산으로 인해 k는 2500이 됨), 500 / 500 = 1 ----> 1 + 2 + 1 = 4
            if(coin[i] <= k) {
                cnt += (k / coin[i]);
                k %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
