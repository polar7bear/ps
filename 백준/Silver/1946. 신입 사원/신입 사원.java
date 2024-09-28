import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int n, res, min;
        List<Person> list;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            list = new ArrayList<>();
            res = 1; // 서류점수가 1위인 사람은 무조건 합격이므로 1로 지정
            min = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                list.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }
            list.sort(Comparator.comparingInt(p -> p.documentScore));

            min = list.get(0).interviewScore; // 서류 점수가 가장 높은사람의 인터뷰 점수로 설정하여 비교시작함

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).interviewScore < min) { // 그 다음으로 서류점수 순위가 높은사람의 인터뷰 스코어가 앞 순위 사람보다 순위가 높다면, 하나라도 더 높은 것이기에 res 증가하고 min 갱신
                    res++;
                    min = list.get(i).interviewScore;
                }
            }
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }

    static class Person {
        int documentScore;
        int interviewScore;

        public Person(int documentScore, int interviewScore) {
            this.documentScore = documentScore;
            this.interviewScore = interviewScore;
        }
    }
}