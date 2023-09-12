import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    String str = i + " " + j + " " + k;
                    bw.write(str + "\n");
                    cnt++;
                    bw.flush();
                }
            }
        }
        bw.write(Integer.toString(cnt));
        bw.close();
    }
}
