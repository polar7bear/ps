import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //intArr = {2, 3}
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
