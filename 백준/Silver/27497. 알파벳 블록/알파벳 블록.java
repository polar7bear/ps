import com.sun.source.tree.IfTree;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<String> dq = new ArrayDeque<>();
        List<Integer> history = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = false; // 덱이 비어있는 상태에서 3이 입력되었을 때 처리하기 위한 플래그 변수

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            String str = "";
            if (st.hasMoreTokens()) {
                str = st.nextToken();
                switch (command) {
                    case 1:
                        dq.addLast(str);
                        history.add(1);
                        isEmpty = false;
                        break;
                    case 2:
                        dq.addFirst(str);
                        history.add(2);
                        isEmpty = false;
                        break;
                }
            } else if (command == 3) {
                if (!dq.isEmpty()) {
                    if (history.get(history.size() - 1) == 1) { // 가장 나중에 추가된 요소가 덱의 가장 끝에 추가된 요소라면
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                    history.remove(history.size() - 1);
                    if (dq.isEmpty()) isEmpty = true;
                } else {
                    isEmpty = true;
                }
            }

        }

        if (isEmpty) {
            System.out.println(0);
        } else {
            for (String s : dq) {
                sb.append(s);
            }
            System.out.println(sb);
        }

    }
}