import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //성실한 개미
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[10][10];
        int x = 1;
        int y = 1;

        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[i].length; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        while(true) {
            if(maze[x][y] == 2) {
                maze[x][y] = 9;
                break;
            }
            maze[x][y] = 9;
            if(maze[x][y+1] == 0 || maze[x][y+1] == 2) {
                y++;
                continue;
            } else if(maze[x][y+1] == 1) {
                if(maze[x+1][y] == 0 || maze[x+1][y] == 2) {
                    x++;
                    continue;
                } else if(maze[x+1][y] == 1) break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}


