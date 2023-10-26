package algorithm.codingtest.boj.stepbystep.two_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {
    public static void main(String[] args) throws IOException {
        //도화지의 크기 100 X 100
        //도화지에 색종이를 n개 붙였을때 n개의 색종이 넓이 구하기 색종이들의 가로,세로 길이는 10
        //도화지의크기를 100X100 boolean 배열로 생성
        //색종이를 붙일 위치인 x와 y를 입력받고 색종이의 가로세로 길이만큼 x와 y에 더함
        //for문으로 순회해서 색종이가 붙여진구간을 모두 true로 저장해줌
        //true였던 요소는 이미 붙여진 부분이므로 카운트 시키지않음.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] bool = new boolean[100][100];
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    if(!bool[j][k]) {   //false일때
                        bool[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
