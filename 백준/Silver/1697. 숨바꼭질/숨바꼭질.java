import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int subin, bro;
    static int[] route;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        subin = Integer.parseInt(st.nextToken());
        bro = Integer.parseInt(st.nextToken());
        if (subin == bro) {
            System.out.println(0);
            return;
        }

        route = new int[100001];

        bfs(subin);
    }

    static void bfs(int subin) {
        Deque<Integer> q = new ArrayDeque<>();
        route[subin] = 1;
        q.add(subin);

        while (!q.isEmpty()) {
            int now = q.pollFirst();

            for (int i = 0; i < 3; i++) {
                int next = 0;
                if (i == 0) {
                    next = now + 1;
                } else if (i == 1) {
                    next = now - 1;
                } else {
                    next = now * 2;
                }

                if (next < 0 || next >= route.length) continue;

                if (next == bro) {
                    System.out.println(route[now]);
                    return;
                }

                if (route[next] == 0) {
                    route[next] = route[now] + 1;
                    q.add(next);
                }
            }
        }
    }
}