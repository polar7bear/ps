import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] level = new int[5][5];
        int[][] time = new int[5][5];
        String[] arr = {"Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki"};

        for (int i = 0; i < 5; i++) { // 난이도 배열 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                level[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) { // 일의 처리 시간 배열 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                time[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int min = Integer.MAX_VALUE;
        int res = -1; // 가장 작은값을 가진 사람의 인덱스를 저장할 변수
        for (int i = 0; i < 5; i++) { 
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    // i번 사람의 j번째 일량 = i번 사람이 예상한 k번째 일의 난이도 x k번 사람이 예상한 j번째 일의 처리시간
                    sum += level[i][k] * time[k][j]; 
                }
            }
            // Sum 변수에 일량의 합 구해서 제일 낮은 요소의 인덱스를 가져와서 변수에 저장
            if (sum <= min) {
                min = sum;
                res = i;
            }
        }
        System.out.println(arr[res]);
    }
}