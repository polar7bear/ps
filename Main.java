import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] baduk = new int[19][19];

        for(int i = 0; i < baduk.length; i++) {
            for(int j = 0; j < baduk.length; j++) {
                baduk[i][j] = sc.nextInt();
            }
        }

        int cnt = sc.nextInt();

        for(int i = 0; i < cnt; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            for(int j = 0; j < baduk.length; j++) {
                if(baduk[x][j] == 0) baduk[x][j] = 1;
                else baduk[x][j] = 0;
            }
            for(int k = 0; k <baduk.length; k++) {
                if(baduk[k][y] == 0) baduk[k][y] = 1;
                else baduk[k][y] = 0;
            }
        }

        for(int i = 0; i < baduk.length; i++) {
            for(int j = 0; j < baduk.length; j++) {
                System.out.print(baduk[i][j] + " ");
            }
            System.out.println();
        }
    }
}

