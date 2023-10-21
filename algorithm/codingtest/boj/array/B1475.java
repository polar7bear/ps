package algorithm.codingtest.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475 {
    static int excep(int a) {
        if(a % 2 == 1) a++;
        a = a / 2;
        return a;
    }
    public static void main(String[] args) throws IOException {
        //방 번호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] numCheck = new int[10];

        while(n > 0) {
            if(n % 10 == 6) {
                numCheck[9]++;
            } else {
                numCheck[n % 10]++;
            }
            n /= 10;
        }

        numCheck[9] = excep(numCheck[9]);

        for(int i : numCheck) cnt = Math.max(i, cnt);
        System.out.println(cnt);
    }
}
