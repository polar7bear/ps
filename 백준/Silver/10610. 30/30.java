import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            list.add(n.charAt(i) - '0');
        }
        
        // 30의 배수 조건을 확인하기 위해 0이 포함되어있는지 체크함
        if (!list.contains(0)) {
            System.out.println("-1");
            return;
        }

        // 각 자리수의 합이 3의 배수인지 확인
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        if (sum % 3 != 0) {
            System.out.println("-1");
            return;
        }

        // 30의 배수중 가장 큰수부터 만들기 위해 내림차순정렬
        list.sort(Collections.reverseOrder());

        // 위의 두조건들을 만족하면 출력
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }

        System.out.println(sb);
    }
}