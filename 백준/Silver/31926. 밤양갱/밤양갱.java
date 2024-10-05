import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // daldidalgo -> dal 3 di 2 dal(복사1) go 2 -> 총 8초
        int go = 8;
        // daldidan -> daldida 복사(1) n 1 -> 총 2초
        int dan = 2;

        int copyTime = 0;

        // N이 1보다 큰 동안 복붙가능
        while (n > 1) {
            n /= 2;
            copyTime++;
        }

        System.out.println(go + dan + copyTime);
    }
}