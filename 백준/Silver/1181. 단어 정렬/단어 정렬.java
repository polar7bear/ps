import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) arr[i] = br.readLine();

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            return o1.length() - o2.length();
        });
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            if (!set.contains(s)) {
                set.add(s);
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb);
    }
}