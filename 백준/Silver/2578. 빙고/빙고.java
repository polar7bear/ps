import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[][] board = new int[5][5];
    static boolean[][] marked = new boolean[5][5];
    static int bingoCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] calledNumbers = new int[25];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                calledNumbers[i * 5 + j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < 25; i++) {
            int num = calledNumbers[i];
            markNumber(num);
            if (checkBingo() >= 3) {
                System.out.println(i + 1);  // call은 0부터 시작하므로 +1
                break;
            }
        }
    }
    
    static void markNumber(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == num) {
                    marked[i][j] = true;
                    return;
                }
            }
        }
    }


    static int checkBingo() {
        bingoCount = 0;
        
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (!marked[i][j]) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) bingoCount++;
        }
        
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (!marked[j][i]) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) bingoCount++;
        }
        
        boolean diagonal1 = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][i]) {
                diagonal1 = false;
                break;
            }
        }
        if (diagonal1) bingoCount++;

        boolean diagonal2 = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][4 - i]) {
                diagonal2 = false;
                break;
            }
        }
        if (diagonal2) bingoCount++;

        return bingoCount;
    }
}