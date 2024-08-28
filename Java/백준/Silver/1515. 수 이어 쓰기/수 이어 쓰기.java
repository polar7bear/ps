import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int ptr = 0;
        int n = 1;

        while (ptr < input.length()) {
            String num = Integer.toString(n);
            for (int i = 0; i < num.length(); i++) {
                if (ptr < input.length() && input.charAt(ptr) == num.charAt(i)) {
                    ptr++;
                }
            }
            n++;
        }
        System.out.println(--n);
    }
}