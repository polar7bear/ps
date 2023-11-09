package part1.time_complexity;

import java.io.*;
import java.util.StringTokenizer;

public class B10158 {
    public static void main(String[] args) throws IOException {
        //개미
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());

        int currentX = (t + p) % (2 * w);
        int currentY = (t + q) % (2 * h);
        if(currentX > w) currentX = 2 * w - currentX;


        if(currentY > h) currentY = 2 * h - currentY;

        bw.write(currentX + " " + currentY);
        bw.flush();
        br.close();
        bw.close();






        /*int timeX = t % (2 * w);
        int currentX = p;
        int dx = 1;

        while(timeX-- > 0) {
            if(currentX == w) {
                dx = -1;
            } else if(currentX == 0) {
                dx = 1;
            }
            currentX += dx;
        }

        int timeY = t % (2 * h);
        int currentY = q;
        int dy = 1;

        while (timeY-- > 0) {
            if(currentY == h) {
                dy = -1;
            } else if(currentY == 0) {
                dy = 1;
            }
            currentY += dy;
        }
        System.out.println(currentX + " " + currentY);*/
    }
}
