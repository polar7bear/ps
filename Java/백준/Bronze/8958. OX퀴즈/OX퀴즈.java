import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            int[] arr = new int[input.length()];
            int cnt = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'O') {
                    arr[i] = ++cnt;
                } else {
                    cnt = 0;
                }
            }
            int res = Arrays.stream(arr)
                    .reduce(0, Integer::sum);
            System.out.println(res);
        }
    }
}