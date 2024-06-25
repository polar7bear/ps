import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. 시작 시간을 첫째줄에 14 30 와 같이 입력받는다
        // 2. 두번째 줄에 요리 시간이 20 과 같이 입력
        // 3. 만약 분끼리 합한 값이 59가 넘어가면 +1시간
        // 4. 23시 59분을 넘으면 0시

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int cook = Integer.parseInt(br.readLine());

        int resHour = 0;
        int resMin = 0;

        int pMin = min + cook;
        if (pMin > 59) {
            resHour = hour + pMin / 60;
            resMin = pMin % 60;

            if (resHour > 23) {
                resHour -= 24;
            }
        } else {
            resHour = hour;
            resMin = pMin;
        }

        System.out.printf("%d %d", resHour, resMin);
    }
}
