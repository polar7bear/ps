package part1.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10431 {
    public static void main(String[] args) throws IOException {
        //줄 세우기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int p = Integer.parseInt(br.readLine());
        //뒤의 요소가 앞의 요소보다 작으면 앞으로 한칸씩 땡긴다. 한칸 땡길때 마다 cnt++

        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append(st.nextToken()).append(" ");
            int[] arr = new int[st.countTokens()];
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int tmp = 0;

            for (int k = 0; k < arr.length; k++) {
                for (int l = 0; l < arr.length - k - 1; l++) {
                    if (arr[l] > arr[l + 1]) {
                        tmp = arr[l];
                        arr[l] = arr[l + 1];
                        arr[l + 1] = tmp;
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
