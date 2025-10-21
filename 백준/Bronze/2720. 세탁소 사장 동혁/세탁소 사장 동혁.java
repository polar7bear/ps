import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int quarter = 25, dime = 10, nickel = 5, penny = 1;

        while (t-- > 0) {
            int exchange = Integer.parseInt(br.readLine());

            while (exchange > 0) {
                int q = exchange / quarter;
                exchange %= quarter;

                int d = exchange / dime;
                exchange %= dime;

                int n = exchange / nickel;
                exchange %= nickel;

                int p = exchange / penny;
                exchange %= penny;

                System.out.println(q + " " + d + " " + n + " " + p);

            }
        }
    }
}
