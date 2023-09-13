import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt(); //부른 횟수
        int[] numArr = new int[cnt];
        int min = 0;

        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();
            numArr[i] += num;
        }
        System.out.println(Arrays.toString(numArr));
        for (int i = 1; i < numArr.length; i++) {
            min = numArr[0];

            if(numArr[i] < min) min = numArr[i];
            //0번째 인덱스보다 1 이 작으면 min은 1
            //2번째보다
        }
        System.out.println(min);
    }
}

