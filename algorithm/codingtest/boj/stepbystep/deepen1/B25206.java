package algorithm.codingtest.boj.stepbystep.deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args) throws IOException {
        //너의 평점은
        //전공 평점은 전공과목별 (학점 x 과목평점)의 합을 학점의 총합으로 나눈 값
        //만약 P등급이라면 계산에서 제외 그리고 F라면 0점
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[20];

        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        float[] gradeScore = {4.5f, 4.0f, 3.5f, 3.0f, 2.5f, 2.0f, 1.5f, 1.0f, 0, 0};
        float total = 0;
        float sum = 0;
        float result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(arr[i], " ");
            String edu = st.nextToken();
            float score = Float.parseFloat(st.nextToken());
            String ct = st.nextToken();

            for (int j = 0; j < grade.length; j++) {
                if (ct.equals(grade[j])) {
                    total += score * gradeScore[j];
                    if (j != 9) {
                        sum += score;
                    }
                }
            }
        }
        result = total / sum;
        System.out.printf("%.6f", result);
    }
}



/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String[][] arr = new String[20][3];
                String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0"};
                float count = 4.5f;
                float total = 0f;

                for(int i = 0; i < 20; i++) {   //입력받은 데이터 배열에 넣기
                    arr[i] = br.readLine().split(" ");
                }

                System.out.println(Arrays.deepToString(arr));
                for(int i = 0; i < arr.length; i++) {
                    if(arr[i][2].equals("P")) { //등급이 P라면
                        continue;
                    } else if(arr[i][2].equals("F")) {  //등급이 F라면
                        continue;
                    }
                    for(int j = 0; j < grade.length; j++) {
                        count = 4.5f;
                        if(arr[i][2].equals(grade[j])) {    //등급 탐색
                            total += Float.parseFloat(arr[i][1]) * count;    //등급에 일치하다면 과목의 합 total에 넣어주기
                        } else {
                            count -= 0.5f;  //학점에 일치 하지 않는다면 0.5씩 감소
                        }
                    }
                }
                float result = total / 20;

                System.out.println(result);*/





