import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        for (int i = 3; i > 0; i--) {
            a += Integer.parseInt(br.readLine()) * i;
        }
        for (int i = 3; i > 0; i--) {
            b += Integer.parseInt(br.readLine()) * i;
        }
        System.out.println(a > b ? "A" : a == b ? "T" : "B");
    }
}