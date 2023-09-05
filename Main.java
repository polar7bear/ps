import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        int i = (b[0] == b[1]) ? 1 : 0;
        System.out.println(i);
    }
}
