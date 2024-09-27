import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer>[] levels;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int size = (int) (Math.pow(2, k) - 1);
        numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //트리의 계층별 노드값들을 리스트에 저장
        levels = new ArrayList[k];

        for (int i = 0; i < k; i++) {
            levels[i] = new ArrayList<>();
        }

        makeTree(0, size - 1, 0); // start, end, depth
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < levels.length; i++) {
            for (int node : levels[i]) {
                sb.append(node).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void makeTree(int start, int end, int depth) {
        if (start > end) return;
        int mid = (start + end) / 2;
        levels[depth].add(numbers[mid]);

        // 왼쪽 하위 트리 구성
        makeTree(start, mid - 1, depth + 1);
        // 오른쪽 하위 트리 구성
        makeTree(mid + 1, end, depth + 1);
    }
}