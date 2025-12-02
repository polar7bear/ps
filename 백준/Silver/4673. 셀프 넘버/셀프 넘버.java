import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        boolean[] arr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int tenthousand = i / 10000;
            int thousand = (i / 1000) % 10;
            int hundred = (i / 100) % 10;
            int ten = (i / 10) % 10;
            int one = i % 10;
            int num = i + tenthousand + thousand + hundred + ten + one;
            if (num <= 10000) arr[num] = true;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }
}