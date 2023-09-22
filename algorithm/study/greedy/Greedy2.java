package algorithm.study.greedy;

import java.util.Scanner;

public class Greedy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        // 입력받는 n을 14, k를 4라고 가정 해보자.
        while(true) {
            // 14 / 4 * 4 = 12
            // 14는 4로 나누었을때 몫은 3이다. 3을 다시 4로 곱하면 12가 나오게되는데,
            // 이 연산식을 이용하면 4로 나눌 수 있는 n보다 낮은 수중 가장 가까운 수를 얻을 수 있다.
            int target = (n / k) * k;

            // 1을 빼는 연산을 수행하는 횟수가 몇번인지
            // 14에서 4로 나누어 떨어지는 숫자인 12까지 총 2번 1을 빼니 14 - 12 = 2
            cnt += (n - target);
            n = target;
            // n이 k보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if(n < k) break;

            // K로 나누기
            cnt += 1;
            n /= k;
        }
        // 마지막으로 남은 수에 대하여 1씩 빼기
        cnt += (n - 1);
        System.out.println(cnt);
    }
}
