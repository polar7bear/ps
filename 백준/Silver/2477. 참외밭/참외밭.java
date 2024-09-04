import java.util.*;
import java.io.*;

/*
    도형의 넓이를 구하려면 큰 사각형에서 작은 사각형을 뺴야함.
    1. 입력받은 각 방향과 길이를 배열에 넣는다.
    2. 큰 사각형의 가로와 세로 길이를 구하기 위해, 동서(1,2)에서 가장 큰 길이가 가로길이가 될 것이고,
    남북(3,4)에서 가장 큰 길이가 세로 길이가 될 것임.
    3. 작은 사각형의 가로 세로 길이는 어떻게 구해야할까?
    4. 작은사각형의 가로길이를 구해보자면, 큰사각형의 윗변과 아랫변을 뺀 값이 될것이다.
    5. 이 값을 구하기 위해서 큰 사각형의 가로길이와 인접한 변의 길이들을 서로 빼준다.
    6. 작은 사각형의 세로길이도 이와 같은 매커니즘으로 구한다.
    7. 최종적으로 큰사각형과 작은사각형의 가로 세로 길이를 구했다면 각각 넓이를 구하고 (큰사각형 넓이 - 작은사각형 넓이) * 참외의 개수 를 출력한다.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] direction = new int[6]; // 방향이 담긴 배열
        int[] length = new int[6]; // 길이가 담긴 배열

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            direction[i] = Integer.parseInt(st.nextToken());
            length[i] = Integer.parseInt(st.nextToken());
        }

        int bigWidth = 0;
        int bigHeight = 0;
        // 큰 사각형의 가로 세로 구하기
        for (int i = 0; i < 6; i++) {
            if (direction[i] == 1 || direction[i] == 2) { // 가로 길이
                bigWidth = Math.max(bigWidth, length[i]);
            } else if (direction[i] == 3 || direction[i] == 4) { // 세로 길이
                bigHeight = Math.max(bigHeight, length[i]);
            }
        }

        int smallWidth = 0;
        int smallHeight = 0;
        // 작은 사각형의 가로 세로 구하기
        for (int i = 0; i < 6; i++) {
            if (direction[i] == 1 || direction[i] == 2) {
                if (bigWidth == length[i]) { // 큰 사각형의 가로길이의 인접변을 이용하여 작은 사각형 세로길이 구하기
                    smallHeight = Math.abs(length[(i - 1 + 6) % 6] - length[(i + 1) % 6]);
                    // 큰 사각형의 가로길이와 인접한변을 구하려면 해당 길이배열의 인덱스에서 -1, +1 한 길이와 같음
                    // 이전 인덱스의 길이를 구할때는 음수가 되지않도록 6을 더해 모듈러 연산을 해주고 절대값으로 구한다
                }
            } else if (direction[i] == 3 || direction[i] == 4) { // 반대로 작은사각형의 가로길이를 구할떄는 큰사각형의 세로길이를 이용
                if (bigHeight == length[i]) {
                    smallWidth = Math.abs(length[(i - 1 + 6) % 6] - length[(i + 1) % 6]);
                }
            }
        }
        System.out.println((bigWidth * bigHeight - smallWidth * smallHeight) * k);
    }
}