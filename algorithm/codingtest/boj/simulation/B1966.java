package algorithm.codingtest.boj.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966 {
    public static void main(String[] args) throws IOException {
        //프린터 큐
        //A B C D 각 문서의 중요도가 2 1 4 3 이라면
        //C D A B 순으로 출력
        //0번째부터 시작 중요도가 같다면 그냥 순서대로
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken()); // 문서의 개수
            int m = Integer.parseInt(st.nextToken()); // 몇번째에 놓여져 있는지

            st = new StringTokenizer(br.readLine(), " ");
            Queue<int[]> importance = new LinkedList<>();

            for(int j = 0; j < n; j++) {
                importance.add(new int[] {j, Integer.parseInt(st.nextToken())});
            }
            int cnt = 0;

            while(!importance.isEmpty()) {
                int[] current = importance.remove();
                boolean canPrint = true;

                for (int[] q : importance) {
                    if(current[1] < q[1]) {
                        canPrint = false;
                        break;
                    }
                }

                if(canPrint) {
                    cnt++;
                    if(current[0] == m) break;
                } else {
                    importance.add(current);
                }
            }
            System.out.println(cnt);
        }
    }
}
