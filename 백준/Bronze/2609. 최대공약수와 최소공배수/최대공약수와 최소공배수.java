import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int max = solution(num1, num2);
        System.out.println(max);
        System.out.println(num1 * num2 / max);

    }

    private static int solution(int num1, int num2) {
        if (num2 == 0) return num1;
        return solution(num2, num1 % num2);
    }
}
