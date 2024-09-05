import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, n);

        int res = fn(size, x, y, 0);
        System.out.println(res);
    }

    static int fn(int size, int x, int y, int cnt) {

        if (size == 1) return cnt; // size가 1x1이 되면 그 좌표가 구하고자 하는 현재까지의 카운트이므로 값 반환함

        size /= 2; // 현재구역을 4등분하기위해 나눕니다

        if (x < size && y < size) {
            return fn(size, x, y, cnt);
        } else if (x < size && y >= size) {
            return fn(size, x, y - size, cnt + size * size); // 2번째 공간에서의 시작 인덱스를 기준으로 y좌표를 갱신하고 지나온 칸 개수만큼 카운트
        } else if (x >= size && y < size) {
            return fn(size, x - size, y, cnt + 2 * size * size); // 3번째 공간 (좌측하단) 시작 인덱스를 기준으로 x좌표 갱신하고 개수 카운트
        } else {
            return fn(size, x - size, y - size, cnt + 3 * size * size); // 마지막 공간의 x,y 인덱스 갱신
        }
    }
}
