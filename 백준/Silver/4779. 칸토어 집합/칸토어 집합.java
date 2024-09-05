import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            if (n == 0) {
                System.out.println("-");
                continue;
            }
            int length = (int) Math.pow(3, n);

            char[] arr = new char[length];
            Arrays.fill(arr, '-');

            int ptr = length / 3;
            while (ptr > 0) {
                for (int i = ptr; i < length; i += 3 * ptr) {
                    for (int j = 0; j < ptr; j++) {
                        arr[i + j] = ' ';
                    }
                }
                ptr /= 3;
            }
            System.out.println(new String(arr));
        }
    }
}
