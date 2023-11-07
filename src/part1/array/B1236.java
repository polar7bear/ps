package part1.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1236 {
    public static void main(String[] args) throws IOException {
        //성 지키기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] rowCheck = new boolean[n];
        boolean[] colCheck = new boolean[m];

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'X') {
                    rowCheck[i] = true;
                    colCheck[j] = true;
                }
            }
        }

        int rowCount = n;
        int colCount = m;

        for (int i = 0; i < n; i++) {
            if (rowCheck[i]) rowCount--;
        }

        for (int i = 0; i < m; i++) {
            if (colCheck[i]) colCount--;
        }
        System.out.println(Math.max(rowCount, colCount));
    }
}
