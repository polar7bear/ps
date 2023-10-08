package algorithm.study.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implement3 {
    public static void main(String[] args) throws IOException {
        //왕실의 나이트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int row = input.charAt(1) - '0';
        int column = input.charAt(0) - 'a' + 1;
        int result = 0;

        int[] dx = {1, -1, 1, -1, 2, -2, 2, -2};
        int[] dy = {2, -2, -2, 2, 1, -1, -1, 1};

        for(int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            if(nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) result++;
        }
        System.out.println(result);
        br.close();
    }
}
