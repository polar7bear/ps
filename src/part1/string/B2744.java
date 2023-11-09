package part1.string;

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String ans = "";
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ans += (char) ('a' + ch - 'A');
            } else {
                ans += (char) ('A' + ch - 'a');
            }
        }
        System.out.println(ans);


        /*StringBuilder sb = new StringBuilder();
        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                sb.append(String.valueOf(input.charAt(i)).toLowerCase());
            } else {
                sb.append(String.valueOf(input.charAt(i)).toUpperCase());
            }
        }
        System.out.println(sb);*/
    }
}
