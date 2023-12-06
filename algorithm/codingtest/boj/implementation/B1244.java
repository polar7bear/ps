package algorithm.codingtest.boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1244 {
    public static void main(String[] args) throws IOException {
        //스위치 켜고 끄기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sw = Integer.parseInt(br.readLine());

        int[] arr = new int[sw];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int student = Integer.parseInt(br.readLine());

        while (student-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (gender == 1) { //남자일 때
                for (int j = num - 1; j < arr.length; j += num) {
                    arr[j] = arr[j] == 1 ? 0 : 1;
                }
            }
            if (gender == 2) { //여자일 때
                arr[num - 1] = arr[num - 1] == 1 ? 0 : 1;

                for (int j = 1; j < arr.length; j++) {
                    if (num - j - 1 >= 0 && num + j - 1 < arr.length && arr[num - j - 1] == arr[num + j - 1]) {
                        arr[num - j - 1] = arr[num - j - 1] == 1 ? 0 : 1;
                        arr[num + j - 1] = arr[num + j - 1] == 1 ? 0 : 1;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
