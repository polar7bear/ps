package algorithm.codingtest.boj.stepbystep.stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2164 {
    public static void main(String[] args) throws IOException {
        //카드 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            q.add(i);
        }

        int size = q.size() - 1;
        int f = 0;

        for(int i = 0; i < size; i++) {
            q.poll();
            if(q.size() >  1) {
                f = q.poll();
                q.offer(f);
            }
        }
        System.out.println(q.peek());
    }
}
