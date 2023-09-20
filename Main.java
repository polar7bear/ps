import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // x의 자릿수 합으로 x가 나누어진다면 그것은 하샤드 수이다. 하샤드 수이면 true 아니라면 false를 return
        int x = 13;
        boolean answer = true;
        int sum = 0;
        String[] strArr = String.valueOf(x).split("");

        int[] intArr = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < intArr.length; i++) {
            sum += intArr[i];

            if(x % sum == 0) answer = true;
            else answer = false;
        }
        System.out.println(answer);

    }
}

