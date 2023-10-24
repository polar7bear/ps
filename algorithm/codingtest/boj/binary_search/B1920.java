package algorithm.codingtest.boj.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {
    static int binarySearch(int[] arr, int a) {   //이진 검색
        int pl = 0;
        int pr = arr.length - 1;
        while (pl <= pr) {
            int pc = (pl + pr) / 2;

            if (arr[pc] == a) {
                return 1;
            } else if (a < arr[pc]) {
                pr = pc - 1;
            } else if (a > arr[pc]) {
                pl = pc + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //수 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        /*for (int i = 1; i < arr.length; i++) {       //이진검색을 위해 배열 오름차순으로 정렬
            int j;
            int tmp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }*/

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(binarySearch(arr, arr2[i]));
        }
    }
}
