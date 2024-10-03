import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int inven = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        //가장위에 있는 블록을 제거하여 인벤토리에 넣는 작업 2초
        //인벤에서 블록을 하나 꺼내어 좌표에 놓는 작업 1초
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(arr[i][j], max);
                min = Math.min(arr[i][j], min);
            }
        }

        int res = 0, minTime = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            int time = 0;
            int inventory = inven;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[j][k] > i) {
                        int remove = arr[j][k] - i;
                        time += remove * 2;
                        inventory += remove;
                    } else if (arr[j][k] < i) {
                        int add = i - arr[j][k];
                        time += add;
                        inventory -= add;
                    }
                }
            }

            if (inventory >= 0 && time <= minTime) {
                minTime = time;
                res = i;
            }
        }
        System.out.println(minTime + " " + res);
    }
}