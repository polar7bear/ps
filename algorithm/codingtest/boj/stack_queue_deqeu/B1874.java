package algorithm.codingtest.boj.stack_queue_deqeu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws IOException {
        //스택 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int j = 1;

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            //4 3 6 8 7 5 2 1
            for (; j <= a; j++) {
                s.push(j);
                sb.append("+").append("\n");

            }
            if (s.peek() == a) {
                s.pop();
                sb.append("-").append("\n");
            } else {
                break;
            }
        }
        if(s.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
