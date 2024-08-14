import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .map(s -> s * s)
                .sum() % 10;

        System.out.println(res);
    }
}