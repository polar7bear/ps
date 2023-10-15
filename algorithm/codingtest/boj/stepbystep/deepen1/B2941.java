package algorithm.codingtest.boj.stepbystep.deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
    public static void main(String[] args) throws IOException {
        //크로아티아 알파벳
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int cnt = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == 'c' && i < input.length() - 1) {
                if(input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') i++;
            }

            else if(c == 'd' && i < input.length() - 1) {
                if(input.charAt(i + 1) == 'z' && i < input.length() - 2) {
                    if(input.charAt(i + 2) == '=') i+=2;
                }
                else if(input.charAt(i + 1) == '-') i++;
            }

            else if((c == 'l' || c == 'n') && i < input.length() - 1) {
                if(input.charAt(i + 1) == 'j') i++;
            }

            else if((c == 's' || c == 'z') && i < input.length() - 1) {
                if(input.charAt(i + 1) == '=') i++;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
