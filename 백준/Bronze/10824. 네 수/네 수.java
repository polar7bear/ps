import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken() + st.nextToken();
        String b = st.nextToken() + st.nextToken();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        System.out.println(bigA.add(bigB));
    }
}

