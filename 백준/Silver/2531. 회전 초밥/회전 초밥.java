import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int type = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int coupon = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] count = new int[type + 1];

        int unique = 0;
        for (int i = 0; i < k; i++) {
            //새로운 초밥 등장시 카운트
            if (count[arr[i]] == 0) unique++;
            count[arr[i]]++;
        }

        int max = unique;

        if (count[coupon] == 0) max++;

        for (int i = 1; i < n; i++) {

            int remove = arr[i - 1];
            count[remove]--; // 좌측 포인터 스시 제외
            if (count[remove] == 0) unique--; // 제외후 해당 초밥 종류가 0이되면 종류 수 감소

            int add = arr[(i + k - 1) % n];
            if (count[add] == 0) unique++; // 새로 추가된 초밥이 새로운 종류일경우 카운트
            count[add]++; // 우측포인터 초밥 추가

            int curMax = unique;
            if (count[coupon] == 0) curMax++; //쿠폰 초밥이 없으면 추가로 먹을 수 있음
            max = Math.max(max, curMax);
        }
        System.out.println(max);
    }
}