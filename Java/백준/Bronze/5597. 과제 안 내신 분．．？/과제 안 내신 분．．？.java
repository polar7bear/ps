import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 30; i++) {
            map.put(i, 0);
        }
        for (int i = 1; i <= 28; i++) {
            map.put(sc.nextInt(), 1);
        }

        List<Integer> collect = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        for (int i : collect) System.out.println(i);

    }
}