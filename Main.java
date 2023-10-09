import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "3people unFollowed me";
        StringTokenizer st = new StringTokenizer(s, " ");
        String[] arr = new String[st.countTokens()];

        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }

        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];

            if(arr[i].length() == 0) {
                answer += " ";
            }
            else {
                answer += str.substring(0, 1).toUpperCase();
                answer += str.substring(1).toLowerCase();
                answer += " ";
            }

        }

        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            System.out.println(answer);
        }

        // 맨 마지막 " " 제거하고 answer 반환
        System.out.println(answer.substring(0, answer.length()-1));
    }
}



