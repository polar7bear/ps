package algorithm.study.greedy;

import java.util.Scanner;

public class Greedy1 {
    public static void main(String[] args) {
        int n = 1260;   // 거스름돈
        int cnt = 0;    // 거스름돈 개수
        int[] coin = {500, 100, 50, 10};    //화폐 단위

        for (int i = 0; i < coin.length; i++) {
            cnt += n / coin[i];
            //배열의 첫 요소인 500부터 순서대로 1260을 나누고
            //500으로는 2번 나눌 수 있으니 cnt에 2개 저장해준다.
            n %= coin[i];
            //500원을 2개 거슬러주어 거슬러주어야 할 돈은 260원이니
            //1260 % 500 = 260. n에는 260이 저장되어 다시 루프반복.
        }
        System.out.println(cnt);
    }
}
