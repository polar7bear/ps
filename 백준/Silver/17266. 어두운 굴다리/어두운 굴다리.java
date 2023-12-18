import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //도로의 길이
        int m = Integer.parseInt(br.readLine()); //가로등의 개수
        int[] lights = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            lights[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(binarySearch(n, lights));
    }

    public static int binarySearch(int n, int[] lights) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (isFull(n, lights, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isFull(int n, int[] lights, int range) {
        int last = 0;
        for (int light : lights) {
            if (light - range > last) {
                return false;
            }
            last = Math.max(last, light + range);
        }
        return last >= n;
    }
}
