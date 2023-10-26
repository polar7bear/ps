package algorithm.codingtest.boj.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B10815 {
    public static void main(String[] args) throws IOException {
        //숫자 카드
        //상근이가 가지고있는 숫자카드 N개중에서 주어진 M개의 정수들이 들어있는지?
        //상근이가 가지고 있는 숫자카드중에서 숫자가 중복되는 카드가 없음 -> set이용
        //상근이가 가지고있다면 1, 가지고 있지 않다면 0을 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> card = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            card.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < m; i++) {
            int c = Integer.parseInt(st.nextToken());
            int result = 0;

            if(card.contains(c)) {
                result = 1;  //가지고 있다면 1 출력
            } else {
                result = 0; //가지고 있지 않다면 0 출력
            }
            System.out.print(result + " ");
        }
    }
}
