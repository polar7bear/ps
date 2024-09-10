import java.util.*;
import java.io.*;

public class Main {
    static int[][] square;
    static int white = 0, blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        square = new int[n][n];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    static void divide(int x, int y, int size) {
        if (check(x, y, size)) {
            if (square[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int divideSize = size / 2;
        divide(x, y, divideSize);
        divide(x, y + divideSize, divideSize);
        divide(x + divideSize, y, divideSize);
        divide(x + divideSize, y + divideSize, divideSize);
    }

    static boolean check(int x, int y, int size) {
        int color = square[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (square[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}