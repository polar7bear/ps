import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int sum = 0;
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("*")) {
                idx = i;
                continue;
            } else {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(arr[i]);
                } else {
                    sum += Integer.parseInt(arr[i]) * 3;;
                }
            }
            
        }

        int w = (idx % 2 == 0) ? 1 : 3;
        for (int x = 0; x <= 9; x++) {
            if ((sum + w * x) % 10 == 0) {
                System.out.println(x);
                return;
            }
        }
    }
}