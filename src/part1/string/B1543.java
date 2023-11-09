package part1.string;

import java.util.Scanner;

public class B1543 {
    public static void main(String[] args) {
        //문서 검색
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String input = sc.nextLine();
        int res = 0;

        for(int i = 0 ; i < str.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < input.length(); j++) {
                if(i + j >= str.length() || str.charAt(i+j) != input.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) {
                res++;
                i += input.length() - 1;
            }
        }
        System.out.println(res);

        //indexOf 사용
        /*Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String input = sc.nextLine();
        int res = 0;
        int start = 0;

        while(true) {
            int idx = str.indexOf(input, start);

            if(idx < 0) break;
            start = idx + input.length();
            res++;
        }
        System.out.println(res);*/

        //replace 사용
        /*Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String input = sc.nextLine();

        String replaceStr = str.replace(input, "");
        int length = str.length() - replaceStr.length();
        int res = length / input.length();
        System.out.println(res);*/
    }
}
