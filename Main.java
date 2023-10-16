import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static int solution(int[][] sizes) {
        int prevMax = 0;
        int prevMin = 0;
        for(int[] size : sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);

            prevMax = Math.max(curMax, prevMax);
            prevMin = Math.max(curMin, prevMin);
        }
        return prevMax * prevMin;


    }
    public static void main(String[] args) throws IOException {
        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(size));

    }
}



