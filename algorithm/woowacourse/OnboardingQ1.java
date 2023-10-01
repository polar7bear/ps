package algorithm.woowacourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OnboardingQ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0; //게임결과


        System.out.print("포비: ");
        String[] pobiStr = br.readLine().split(" ");
        System.out.print("크롱: ");
        String[] crongStr = br.readLine().split(" ");

        int[] pobi = Arrays.stream(pobiStr).mapToInt(Integer::parseInt).toArray();
        int[] crong = Arrays.stream(crongStr).mapToInt(Integer::parseInt).toArray();

        Exception e = new Exception();
        if(pobi[1] != pobi[0] + 1 || crong[1] != crong[0] + 1) {
            result = -1;
            System.out.println(result);
            e.printStackTrace();
        } else if (pobi[0] % 2 != 1 || crong[0] % 2 != 1
                || pobi[1] % 2 != 0 || crong[1] % 2 != 0) {
            result = -1;
            System.out.println(result);
            e.printStackTrace();
        } else if((pobi[0] == 1 && pobi[1] == 2) || (pobi[0] == 399 && pobi[1] == 400)
                || (crong[0] == 1 && crong[1] == 2) || (crong[0] == 399 && crong[1] == 400)) {
            result = -1;
            System.out.println(result);
            e.printStackTrace();
        }

        int pobiPlus = 0;
        int pobiMulti = 1;
        int pobiResult = 0;
        int crongPlus = 0;
        int crongMulti = 1;
        int crongResult = 0;

        //[131, 132] 라면
        //백의 자리는 pobi[i] / 100
        //십의 자리는 (pobi[i] / 10) % 10
        //일의 자리는 pobi[i] % 10
        //[97, 98] 라면 0 9 7 / 0 9 8 곱햇을때 0이랑 곱해서 0이 나오니 이슈가발생함
        //[5, 6]
        for(int i = 0; i < pobi.length; i++) {
            if(pobi[i] < 10) {
                crongResult = Math.max(pobi[0], pobi[1]);
            } else if(pobi[i] < 100) {
                int ten = (pobi[i] / 10) % 10;
                int one = pobi[i] % 10;
                pobiPlus = ten + one;
                pobiMulti = ten * one;
            } else if(pobi[i] < 400) {
                int hundred = pobi[i] / 100;
                int ten = (pobi[i] / 10) % 10;
                int one = pobi[i] % 10;
                pobiPlus = hundred + ten + one;
                pobiMulti = hundred * ten * one;
            }
            if(pobiPlus > pobiMulti) {
                pobiResult = pobiPlus;
            } else {
                pobiResult = pobiMulti;
            }
        }

        for(int i = 0; i < crong.length; i++) {
            if(crong[i] < 10) {
                crongResult = Math.max(crong[0], crong[1]);
            } else if(crong[i] < 100) {
                int ten = (crong[i] / 10) % 10;
                int one = crong[i] % 10;
                crongPlus = ten + one;
                crongMulti = ten * one;
            } else if(crong[i] < 400) {
                int hundred = crong[i] / 100;
                int ten = (crong[i] / 10) % 10;
                int one = crong[i] % 10;
                crongPlus = hundred + ten + one;
                crongMulti = hundred * ten * one;
            }
            if(crongPlus > crongMulti) {
                crongResult = crongPlus;
            } else {
                crongResult = crongMulti;
            }
        }

        if(pobiResult > crongResult) {
            result = 1;
        } else if(pobiResult < crongResult) {
            result = 2;
        } else if(pobiResult == crongResult) {
            result = 0;
        }
        System.out.println(result);
    }
}
