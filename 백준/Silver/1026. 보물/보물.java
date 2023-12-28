import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Integer[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        boolean[] usedA = new boolean[n];
        boolean[] usedB = new boolean[n];

        int res = 0;
        for (int i = 0; i < n; i++) {

            int min = -1;
            for (int j = 0; j < n; j++) {
                if (!usedA[j] && (min == -1 || a[j] < a[min])) {
                    min = j;
                }
            }

            int max = -1;
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (!usedB[j] && (idx == -1 || b[j] > max)) {
                    max = b[j];
                    idx = j;
                }
            }

            res += a[min] * max;
            usedA[min] = true;
            usedB[idx] = true;
        }
        System.out.println(res);
    }
}

