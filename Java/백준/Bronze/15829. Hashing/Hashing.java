import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long sum = 0;
        long r = 1;

        for (int i = 0; i < l; i++) {
            int val = arr[i] - 96;

            sum = (sum + val * r) % 1234567891;
            r = (31 * r) % 1234567891;
        }
        System.out.println(sum % 1234567891);
    }
}