package part1.array;

import java.io.*;

public class B10989 {
    public static void main(String[] args) throws IOException {
        //수 정렬하기3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (arr[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
