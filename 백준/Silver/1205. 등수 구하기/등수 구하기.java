import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int res = 1;

        Integer[] arr = new Integer[n];

        if(n == 0) {
            System.out.println(1);
            System.exit(0);
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        //랭킹 리스트가 꽉 차 있고 제일 낮은 랭킹 점수보다 작거나 같으면 -1 출력
        if (arr[arr.length - 1] >= score && n == p) System.out.println(-1);
        else {
            for (Integer i : arr) {
                if (i > score) res++;
                else break;
            }
            System.out.println(res);
        }
    }
}
