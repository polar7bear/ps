import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringSet stringSet = new StringSet();
        SubstrGenerator generator = new SubstrGenerator();

        List<String> strings = generator.generateSubstrings(br.readLine());
        stringSet.insertAll(strings);

        stringSet.printResult();
    }

    static class SubstrGenerator {
        List<String> strings = new ArrayList<>();

        List<String> generateSubstrings(String input) {
            for (int i = 0; i < input.length(); i++) {
                for (int j = i; j < input.length(); j++) {
                    strings.add(input.substring(i, j + 1));
                }
            }
            return strings;
        }
    }

    static class StringSet {
        Set<String> set = new HashSet<>();

        void insertAll(List<String> strings) {
            set.addAll(strings);
        }

        void printResult() {
            System.out.println(set.size());
        }
    }
}