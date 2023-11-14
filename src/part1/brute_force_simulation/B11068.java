package part1.brute_force_simulation;

import java.util.Scanner;

public class B11068 {
    //회문인 수
    public static boolean isPalindrome(int x, int base) {
        int[] digit = new int[20];
        int len = 0;
        while (x > 0) {
            digit[len++] = x % base;
            x /= base;
        }

        for (int i = 0; i < len / 2; i++)
            if (digit[i] != digit[len - i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            boolean ans = false;

            for (int i = 2; i <= 64; i++) {
                if (isPalindrome(x, i)) {
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? 1 : 0);
        }
    }
}
