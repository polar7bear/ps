import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 거인나라 인구 수
        int h = Integer.parseInt(st.nextToken()); // 센티의 키
        int t = Integer.parseInt(st.nextToken()); // 뿅망치 사용가능 횟수

        PriorityQueue<Integer> height = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;

        for (int i = 0; i < n; i++) height.add(Integer.parseInt(br.readLine()));

        while (t-- > 0 && height.peek() >= h) {
            int max = height.poll();

            if (max == 1) { // 거인의 키가 1이면 우선순위 큐의 가장 마지막 요소 일 것이므로 다시 추가하고 반복을 멈춤
                height.add(max);
                break;
            }

            height.add(max / 2);
            cnt++;
        }

        if (height.peek() < h) {
            System.out.println("YES");
            System.out.println(cnt);
        } else {
            System.out.println("NO");
            System.out.println(height.peek());
        }
    }
}