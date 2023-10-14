package algorithm.codingtest.boj.stepbystep.deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1157 {
    public static void main(String[] args) throws IOException {
        //단어 공부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //가장 많이 나온 알파벳을 판단 하기위해 알파벳 개수(26개)만큼 크기의 int 배열 생성
        int[] arr = new int[26];
        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            //문제에서는 대소문자 구분없이라는 제한이 있었기에 대문자일때, 소문자일때의 경우를 모두 처리 해주어야한다.
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {    //대문자일때
                arr[s.charAt(i) - 65]++;    //만약 첫글자가 B일경우 B는 아스키코드로 66이다. arr[66 - 65]++
            } else {    //소문자일때 #현업에서는 가능하면 가독성을 위해 else문 사용을 지양하지만 코딩테스트에서는 최대한 빨리 풀어야하기때문에 그냥 쓰자
                arr[s.charAt(i) - 97]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        //입력받은 문자열의 각 알파벳들의 수 만큼 arr에 그 결과를 저장 해주었으니,
        //이제 arr에서 가장 높은 숫자를 char로 형변환 후 대문자로 출력하면 된다.
        //숫자가 같은 요소가 있다면 ?을 출력해야함
        int max = 0;
        char ch = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if(arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
