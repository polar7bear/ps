import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s;
        int n = Integer.parseInt(br.readLine());
        int res = 0;
        while (n-- > 0) {
            String input = br.readLine();
            s = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (!s.isEmpty() && s.peek() == ch) {
                    s.pop();
                } else {
                    s.push(ch);
                }
            }
            if (s.isEmpty()) res++;
        }
        System.out.println(res);
    }
}
