package algorithm.codingtest.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10828 {
    //스택 구현
    public static int[] stk;  //배열스택
    public static int ptr = 0;    //포인터

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        stk = new int[n];

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        stk[ptr] = x;
        ptr++;
    }

    public static int pop() {
        if (ptr == 0) return -1;
        else {
            int res = stk[ptr - 1];
            stk[ptr - 1] = 0;
            ptr--;
            return res;
        }
    }

    public static int size() {
        return ptr;
    }

    public static int empty() {
        if (ptr == 0) {
            return 1;
        }
        return 0;
    }

    public static int top() {
        if (ptr == 0) {
            return -1;
        }
        return stk[ptr - 1];
    }
}
