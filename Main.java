import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        //                   겨울        봄        여름         가을
        int[][] season = {{12, 1, 2}, {3, 4, 5}, {6, 7, 8}, {9, 10, 11}};

        for (int i = 0; i < season.length; i++) {   //1차 배열 인덱스 접근
            if (IntStream.of(season[i]).anyMatch(s -> s == a)) {    //만약 1차배열중 입력받은 숫자가 포함되면
                if (season[i] == season[0]) {
                    System.out.println("winter");
                } else if (season[i] == season[1]) {
                    System.out.println("spring");
                } else if (season[i] == season[2]) {
                    System.out.println("summer");
                } else if (season[i] == season[3]) {
                    System.out.println("fall");
                }
            }
        }


    }
}
