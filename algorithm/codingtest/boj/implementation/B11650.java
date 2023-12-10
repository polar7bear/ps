package algorithm.codingtest.boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Coordinate[] coordinates = new Coordinate[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            coordinates[i] = new Coordinate(x, y);
        }

        Arrays.sort(coordinates);
        StringBuilder sb = new StringBuilder();
        for(Coordinate coordinate : coordinates) {
            sb.append(coordinate.x + " " + coordinate.y + "\n");
        }
        System.out.println(sb);

    }

    static class Coordinate implements Comparable<Coordinate> {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            int curX = x - o.x;
            return (curX == 0) ? y - o.y : curX;
        }
    }
}
