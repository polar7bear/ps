import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fruits = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] count = new int[10];

        int start = 0, maxLength = 0, typeCount = 0;

        for (int end = 0; end < n; end++) {
            if (count[fruits[end]] == 0) typeCount++;
            count[fruits[end]]++;

            while (typeCount > 2) {
                count[fruits[start]]--;
                if (count[fruits[start]] == 0) typeCount--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println(maxLength);
    }
}