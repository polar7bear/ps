import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        while (true) {
            input = br.readLine();
            if (input.equals(".")) break;

            Stack<Character> s = new Stack<>();
            boolean isBalanced = true;  // 균형을 확인하는 플래그 변수

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(' || ch == '[') {
                    s.push(ch);
                } else if (ch == ')') {
                    if (s.isEmpty() || s.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    s.pop();
                } else if (ch == ']') {
                    if (s.isEmpty() || s.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    s.pop();
                }
            }

            if (!s.isEmpty()) {
                isBalanced = false;
            }

            if (isBalanced) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.print(sb);
    }
}
