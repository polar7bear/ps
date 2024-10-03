import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] count = new int[n];  // 각 학생이 몇 명과 같은 반이었는지 저장하는 배열

        // 각 학생에 대해 다른 학생들과 같은 반인 학생 수 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;  // 자신은 제외 시켜야함
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {  // i번 학생과 j번학생이 k학년에 같은 반이면
                        count[i]++;  // 같은 반인 학생 수 증가
                        break;  // 같은 학년에서 같은 반이면 더이상 체크할 필요없음
                    }
                }
            }
        }

        int max = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (count[i] > max || (count[i] == max && i < res)) { //
                max = count[i];
                res = i;
            }
        }

        // 1부터 시작하므로 1을 더하고 출력
        System.out.println(res + 1);


    }
}