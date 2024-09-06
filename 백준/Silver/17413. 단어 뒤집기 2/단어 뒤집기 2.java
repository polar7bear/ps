import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        boolean tag = false;
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '<') {
                while (!s.isEmpty()) {
                    sb.append(s.pop());
                }
                tag = true;
                sb.append(ch);
            } else if (ch == '>') {
                tag = false;
                sb.append(ch);
            } else if (tag) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    while (!s.isEmpty()) {
                        sb.append(s.pop());
                    }
                    sb.append(ch);
                } else {
                    s.push(ch);
                }
            }
        }

        while (!s.isEmpty()) sb.append(s.pop());
        System.out.println(sb);
    }
}