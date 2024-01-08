import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); //도시의 수
        int m = Integer.parseInt(br.readLine()); //여행 계획에 속한 도시들의 수

        parent = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int link = Integer.parseInt(st.nextToken());

                if (link == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int first = find(Integer.parseInt(st.nextToken()));
        boolean check = true;

        for (int i = 2; i <= m; i++) {
            int next = find(Integer.parseInt(st.nextToken()));

            if (first != next) {
                check = false;
                break;
            }
        }

        String res = check ? "YES" : "NO";
        System.out.println(res);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
        }
    }

    private static int find(int x) {
        if (parent[x] == x) return x;
        return find(parent[x]);
    }
}

