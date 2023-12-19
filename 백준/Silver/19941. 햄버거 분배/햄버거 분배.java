import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //식탁의 길이
        int k = Integer.parseInt(st.nextToken()); //햄버거를 선택할 수 있는 거리
        char[] arr = br.readLine().toCharArray();

        int res = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                int idx = Math.max(i - k, 0); //왼쪽 탐색 범위가 배열 인덱스 범위를 빠져 나가게 될 경우를 생각
                boolean flag = false; //먹을 수 있는 햄버거가 있는지 유무를 체크하기 위함

                for (int j = idx; j < i; j++) { //사람이 있는 앞의 위치까지만 탐색 (왼쪽 범위)
                    if (arr[j] == 'H') {
                        res++;
                        arr[j] = 'X'; //이미 먹은 햄버거에 접근을 재접근 하지 못하게 X로 초기화 시켜줌
                        flag = true;
                        break; //처음 찾은 햄버거를 먹으면 바로 break
                    }
                }

                if (!flag) { //왼쪽 범위에서 햄버거를 먹었다면 true인 상태로 오른쪽을 탐색 안하게 됨
                    idx = i + k >= n ? n - 1 : i + k; //오른쪽 탐색 범위가 배열 인덱스 범위를 초과하게 되면 배열의 끝 인덱스, 아니라면 사람의 위치 + 먹을 수 있는 범위
                    for (int j = i + 1; j <= idx; j++) { //사람 + 1 위치부터 idx까지 탐색
                        if (arr[j] == 'H') {
                            res++;
                            arr[j] = 'X';
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}

