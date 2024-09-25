import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
            left.push(input.charAt(i)); // 제일처음 커서의 위치는 맨 뒤이므로 커서 기준 왼쪽 문자열들을 전부 left 스택에 저장

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "P":
                    char ch = command[1].charAt(0);
                    left.push(ch);
                    break;

                case "L":
                    if (!left.isEmpty()) right.push(left.pop());
                    break;

                case "D":
                    if (!right.isEmpty()) left.push(right.pop());
                    break;

                case "B":
                    if (!left.isEmpty()) left.pop();
            }
        }

        for (char ch : left) sb.append(ch);
        while (!right.isEmpty()) sb.append(right.pop());
        System.out.println(sb);
    }
}