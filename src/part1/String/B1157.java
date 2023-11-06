package part1.String;

import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        //단어 공부
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                arr[str.charAt(i) - 'A']++;
            } else {
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = 0;
        char ch = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if(arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
