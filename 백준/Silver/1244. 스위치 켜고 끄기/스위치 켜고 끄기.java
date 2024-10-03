import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] switches = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int students = Integer.parseInt(br.readLine());

        while (students-- > 0) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int i = num; i <= n; i += num) {
                    switches[i] = switches[i] == 1 ? 0 : 1;
                }
            } else if (gender == 2) {
                switches[num] = switches[num] == 1 ? 0 : 1;

                for (int i = 1; i <= switches.length; i++) {
                    if (num - i >= 1 && num + i <= n && switches[num - i] == switches[num + i]) {
                        switches[num - i] = switches[num - i] == 1 ? 0 : 1;
                        switches[num + i] = switches[num + i] == 1 ? 0 : 1;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 1; i < switches.length; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}