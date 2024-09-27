import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. 트리에서 자식노드 값을 2로 나누면 부모노드의 값을 구할 수 있다
         * 2. a와 b를 2로 나누면서 쭉 부모노드로 올라감
         * 3. 서로 공통되는 최상위 노드를 찾아야 하기때문에 a와 b중 큰값을 먼저 나눔. 값이 같아지면 반복 멈춤*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a, b;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            while (a != b) {
                if (a > b) {
                    a /= 2;
                } else if (b > a) {
                    b /= 2;
                }
            }
            sb.append(b * 10).append("\n");
        }
        System.out.println(sb);
    }
}