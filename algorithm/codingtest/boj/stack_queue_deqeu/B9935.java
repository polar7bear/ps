package algorithm.codingtest.boj.stack_queue_deqeu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9935 {
    public static void main(String[] args) throws IOException {
        //문자열 폭발
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> s = new Stack<>();
        String bomb = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));

            if(s.size() >= bomb.length()) {
                boolean flag = true;

                for(int j = 0; j < bomb.length(); j++) {
                    if(s.get(s.size() - bomb.length() + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    for (int j = 0; j < bomb.length(); j++) s.pop();
                }
            }
        }
        for(char ch : s) {
            sb.append(ch);
        }

        if(s.isEmpty()) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
