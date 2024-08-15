import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        String res = Stream.of(score)
                .map(s -> {
                    if (s >= 90) return "A";
                    else if (s >= 80) return "B";
                    else if (s >= 70) return "C";
                    else if (s >= 60) return "D";
                    else return "F";
                })
                .findFirst()
                .get();

        System.out.println(res);
    }
}