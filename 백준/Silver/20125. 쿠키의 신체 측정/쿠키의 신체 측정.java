import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int hX = 0; //심장 x좌표
        int hY = 0; //심장 y좌표
        char[][] square = new char[n + 1][n + 1];

        for(int i = 1; i <= n; i++) {
            String s = br.readLine();
            for(int j = 1; j <= n; j++) {
                square[i][j] = s.charAt(j-1);
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(square[i][j] == '*') {
                    hX = i+1;
                    hY = j;
                    cnt++;
                    sb.append(hX + " " + hY + "\n");
                    break;
                }
            }
            if(cnt == 1) break;
        }

        int leftArm = 0;
        for(int i = hY - 1; i >= 1; i--) {
            char ch = square[hX][i];
            if(ch == '*') {
                leftArm++;
            } else {
                break;
            }
        }

        int rightArm = 0;
        for(int i = hY + 1; i <= n; i++) {
            char ch = square[hX][i];
            if(ch == '*') {
                rightArm++;
            } else {
                break;
            }
        }

        int back = 0;
        int legX = 0;
        for(int i = hX + 1; i < n; i++) {
            char ch = square[i][hY];
            if(ch == '*') {
                back++;
                legX = i + 1;
            } else {
                break;
            }
        }

        int leftLeg = 0;
        for(int i = legX; i <= n; i++) {
            char ch = square[i][hY-1];
            if(ch == '*') {
                leftLeg++;
            } else {
                break;
            }
        }

        int rightLeg = 0;
        for(int i = legX; i <= n; i++) {
            char ch = square[i][hY+1];
            if(ch == '*') {
                rightLeg++;
            } else {
                break;
            }
        }

        sb.append(leftArm + " " + rightArm + " " + back + " " + leftLeg + " " + rightLeg);

        System.out.println(sb);
    }
}