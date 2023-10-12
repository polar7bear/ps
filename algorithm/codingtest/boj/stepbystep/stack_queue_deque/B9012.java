package algorithm.codingtest.boj.stepbystep.stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    //괄호
    public static String stack(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(') {
                s.push(ch);
            } else if(s.empty()) {
                return "NO";
            } else {
                s.pop();
            }
        }

        if(s.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());



        for(int i = 0; i < t; i++) {
            sb.append(stack(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}
