package algorithm.study.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implement1 {
    public static void main(String[] args) throws IOException {
        //구현 (시뮬레이션, 완전탐색) 알고리즘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int area = Integer.parseInt(br.readLine());
        String[] move = br.readLine().split(" ");

        int x = 1, y = 1;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        char[] plan = {'R', 'L', 'D', 'U'};

        for (int i = 0; i < move.length; i++) {
            char m = move[i].charAt(0);
            int nx = 0, ny = 0;
            for (int j = 0; j < plan.length; j++) {
                if (m == plan[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > area || ny > area) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
