package algorithm.codingtest.boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B16967 {
    public static void main(String[] args) throws IOException {
        //배열 복원
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[][] B = new int[H + X][W + Y];

        for (int i = 0; i < H + X; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < W + Y; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i >= X && j >= Y) {
                    // (i, j)가 두 배열 모두에 포함되는 경우
                    A[i][j] = B[i][j] - A[i - X][j - Y];
                } else {
                    // (i, j)가 두 배열 중 하나에 포함되는 경우
                    A[i][j] = B[i][j];
                }
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
