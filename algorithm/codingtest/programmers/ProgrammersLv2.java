package algorithm.codingtest.programmers;

import java.util.*;

public class ProgrammersLv2 {
    public String solution1(String s) {
        //최댓값과 최솟값
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ");

        int[] arr = new int[st.countTokens()];

        for(int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        answer = min + " " + max;

        return answer;
    }

    public String solution2(String s) {
        //JadenCase 문자열 만들기
        String answer = "";
        String[] arr = s.split(" ");

        for(int i=0; i<arr.length; i++) {
            String now = arr[i];

            if(arr[i].length() == 0) {
                answer += " ";
            }
            else {
                answer += now.substring(0, 1).toUpperCase();
                answer += now.substring(1, now.length()).toLowerCase();
                answer += " ";
            }

        }

        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }

        return answer.substring(0, answer.length()-1);
    }
}
