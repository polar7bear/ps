import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> res = Stream.generate(st::nextToken)
                .limit(st.countTokens())
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        res.forEach(i -> System.out.print(i + " "));
    }
}

