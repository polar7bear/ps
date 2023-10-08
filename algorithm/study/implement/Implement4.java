package algorithm.study.implement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Implement4 {
    static ArrayList<Character> arrayList = new ArrayList<>();
    static String input;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        //문자열 재정렬
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                arrayList.add(input.charAt(i));
            } else {
                sum += input.charAt(i) - '0';
            }
        }
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        if (sum != 0) System.out.print(sum);
    }
}
