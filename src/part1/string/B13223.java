package part1.string;

import java.util.Scanner;

public class B13223 {
    public static void main(String[] args) {
        //소금 폭탄
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(":");
        int curHour = Integer.parseInt(arr[0]);
        int curMin = Integer.parseInt(arr[1]);
        int curSec = Integer.parseInt(arr[2]);

        String[] arr2 = sc.nextLine().split(":");
        int targetHour = Integer.parseInt(arr2[0]);
        int targetMin = Integer.parseInt(arr2[1]);
        int targetSec = Integer.parseInt(arr2[2]);

        int cur = curHour * 3600 + curMin * 60 + curSec;
        int target = targetHour * 3600 + targetMin * 60 + targetSec;

        int needSec = target - cur;
        if (needSec <= 0) needSec += 24 * 3600;

        int hour = needSec / 3600;
        int minute = (needSec % 3600) / 60;
        int second = needSec % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
