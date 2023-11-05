package part1.String;

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                sb.append(String.valueOf(input.charAt(i)).toLowerCase());
            } else {
                sb.append(String.valueOf(input.charAt(i)).toUpperCase());
            }
        }
        System.out.println(sb);
    }
}
