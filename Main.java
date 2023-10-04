import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> s = new Stack<>();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {};

        for(int i : arr) {
            if(s.isEmpty()) s.push(i);
            else if(s.peek() != i) s.push(i);   //중복 요소 제거
        }

        answer = new int[s.size()];

        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = s.pop();
        }
        System.out.println(Arrays.toString(answer));
    }
}


