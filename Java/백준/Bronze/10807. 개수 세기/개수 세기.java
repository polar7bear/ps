import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        int v = Integer.parseInt(br.readLine());
        int res = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == v) res++;
        }
        System.out.println(res);
    }
}