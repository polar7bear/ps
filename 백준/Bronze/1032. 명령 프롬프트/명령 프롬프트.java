import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] res = br.readLine().toCharArray();
        while(n-- > 1) {
            char[] input = br.readLine().toCharArray();
            
            for(int i = 0; i < input.length; i++) {
                if(res[i] != input[i]) {
                    res[i] = '?';
                }
            }
        }
        String result = new String(res);
        System.out.println(result);
    }
}