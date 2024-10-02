import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sub = br.readLine().split("-");

        int res = 0;

        for (int i = 0; i < sub.length; i++) {
            String[] add = sub[i].split("\\+");
            int sum = 0;

            for (String val : add) sum += Integer.parseInt(val);

            if (i == 0) res += sum;
            else res -= sum;
        }
        System.out.println(res);
    }
}