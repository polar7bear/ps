package algorithm.codingtest.boj.map_set_tree_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> poketmonStr = new HashMap<>();
        Map<Integer, String> poketmonInt = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());   //도감에 등록된 포켓몬 개수
        int m = Integer.parseInt(st.nextToken());   //맞춰야 하는 문제 수

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            poketmonStr.put(s, i);
            poketmonInt.put(i, s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String a = br.readLine();

            if (a.chars().allMatch(Character :: isDigit)) {
                int c = Integer.parseInt(a);
                sb.append(poketmonInt.get(c)).append("\n");
            } else {
                sb.append(poketmonStr.get(a)).append("\n");
            }
        }
        System.out.println(sb);
    }
}

    /*     처음에 풀었던 방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> poketmon = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());   //도감에 등록된 포켓몬 개수
        int m = Integer.parseInt(st.nextToken());   //맞춰야 하는 문제 수

        for (int i = 1; i <= n; i++) {
            poketmon.put(br.readLine(), i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String a = br.readLine();

            if (a.chars().allMatch(Character :: isDigit)) {
                int c = Integer.parseInt(a);

                for (String key : poketmon.keySet()) {
                    int value = poketmon.get(key);
                    if (value == c) {
                        sb.append(key).append("\n");
                    }
                }
            } else {
                sb.append(poketmon.get(a)).append("\n");
            }
        }
        System.out.println(sb);
    }*/
/*- HashMap<String, Integer>로 선언 했다고 가정하고 이 부분에서 만약 포켓몬 번호(Integer)가 입력되면
해당 value의 key값을 가져와야 해서 맵의 keyset을 가져오고 for문 안에 조건문을 통해 입력된 숫자가 해당 value와 일치 하는지 검사했다.
        - 이 과정 때문에 시간 초과가 되었는데 맞춰야 하는 문제의 입력이 모두 정수로 들어오게 되면 시간 복잡도가 O(n*m)이다.
        - 이를 해결 하기 위해서 문자열을 key로 가지는 해시 맵과 정수를 key로 가지는 해시맵 두 가지를 선언하여 입력 받아 해결했다.
        이 방식으로 해결하면 value에 접근하여 key를 가져오지 않아도 되니 코드도 상당 부분 줄고, O(1)의 시간 복잡도로 바로 찾아 낼 수 있다.*/
