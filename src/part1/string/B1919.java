package part1.string;

import java.util.Scanner;

public class B1919 {
    public static int[] func(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        return arr;
    }

    public static void main(String[] args) {
        //에너그램 만들기
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int res = 0;

        //중복되는 부분 함수화 하기
        /*int[] arr = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }*/

        int[] arr = func(str1);
        int[] arr2 = func(str2);

        for (int i = 0; i < arr.length; i++) {
            res += Math.abs(arr[i] - arr2[i]);
            // 절댓값 구해서 대소 구분 없애기
            /*if(arr[i] > arr2[i]) {
                res += arr[i] - arr2[i];
            } else if(arr[i] < arr2[i]) {
                res += arr2[i] - arr[i];
            }*/
        }
        System.out.println(res);
    }
}
