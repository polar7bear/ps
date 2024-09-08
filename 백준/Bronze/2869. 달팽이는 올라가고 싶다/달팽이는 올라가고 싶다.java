import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 낮에 올라갈수있는 높이
        int b = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
        int v = Integer.parseInt(st.nextToken()); // 나무막대의 높이
        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
