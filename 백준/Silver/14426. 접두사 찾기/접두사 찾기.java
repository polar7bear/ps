import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);
        String input;
        int cnt = 0;
        while (m-- > 0) {
            input = br.readLine();

            if (search(arr, input)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean search(String[] arr, String input) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid].startsWith(input)) {
                return true;
            } else if (arr[mid].compareTo(input) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}