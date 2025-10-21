import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[16];
        arr[1] = 3;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = 2 * arr[i - 1] - 1;
        }

        System.out.println(arr[n] * arr[n]);
    }
}