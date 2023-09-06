import com.sun.jdi.BooleanType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        //두 수가 거짓일 경우에만 참(1)을 출력
        boolean b1 = b[0] == 0 && b[1] == 0;

        int result = (b1) ?1 :0;
        System.out.println(result);
    }
}
