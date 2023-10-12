package algorithm.codingtest.programmers.reviewnote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Review1 {
    //Lv.1 이상한 문자 만들기
    //내가 작성한 코드(오답)
    /*public static String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String a = "";
        String b = "";

        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for(int j = 0; j < arr[i].length(); j++) {
                //if(arr[i].charAt(j) == 32) continue;
                if(arr[i].charAt(0) == 32) {
                    sb.append(arr[i].charAt(0));
                }
                if(j % 2 == 0) {
                    if(arr[i].charAt(j) >= 97 && arr[i].charAt(j) <= 122) {
                        char c1 = (char) (arr[i].charAt(j) - 32);
                        a = String.valueOf(c1);
                        sb.append(a);
                    } else {
                        sb.append(arr[i].charAt(j));
                    }
                } else if(j % 2 != 0) {
                    if(arr[i].charAt(j) >= 65 && arr[i].charAt(j) <= 90 ) {
                        char c2 = (char) (arr[i].charAt(j) + 32);
                        b = String.valueOf(c2);
                        sb.append(b);
                    } else {
                        sb.append(arr[i].charAt(j));
                    }
                }
            }
            if(i == arr.length - 1) break;
            sb.append(" ");
        }
        return sb.toString();
    }*/
    public static String solution(String s) throws IOException {
        String[] arr = s.split("");
        int cnt = 0;
        String answer = "";
        for(String str : arr) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(solution("try hello  world"));
    }
}
