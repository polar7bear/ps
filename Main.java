import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        while(st.hasMoreElements()) {
            bw.write(Integer.parseInt(st.nextToken()));
            bw.newLine();
            bw.flush();
            if(Integer.parseInt(st.nextToken()) == 0) break;
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] intArr = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i : intArr) {
            if(i == 0) break;
            System.out.println(i);
        }

    }
}
