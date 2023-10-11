package algorithm.codingtest.boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {
    //제로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] == 0) {
                s.pop();
            } else {
                s.push(arr[i]);
            }
        }

        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
        }
        System.out.println(sum);


    }
}
