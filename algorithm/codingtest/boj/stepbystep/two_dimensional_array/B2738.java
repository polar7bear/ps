package algorithm.codingtest.boj.stepbystep.two_dimensional_array;

import java.io.*;
import java.util.StringTokenizer;

public class B2738 {
    public static void main(String[] args) throws IOException {
        //행렬의 덧셈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + Integer.parseInt(st.nextToken()) + " ");
            }
            System.out.println();
        }
    }
}
