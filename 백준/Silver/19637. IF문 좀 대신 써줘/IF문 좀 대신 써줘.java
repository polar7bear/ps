import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int title = Integer.parseInt(st.nextToken());
        int champ = Integer.parseInt(st.nextToken());

        List<Title> list = new ArrayList<>();
        for (int i = 0; i < title; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int power = Integer.parseInt(st.nextToken());
            list.add(new Title(name, power));
        }

        for (int i = 0; i < champ; i++) {
            int power = Integer.parseInt(br.readLine());
            sb.append(bs(list, power)).append("\n");
        }
        System.out.println(sb);
    }

    private static class Title {
        String name;
        int power;

        public Title(String name, int power) {
            this.name = name;
            this.power = power;
        }
    }

    private static String bs(List<Title> list, int power) {
        int pl = 0;
        int pr = list.size() - 1;

        while (pl < pr) {
            int mid = (pl + pr) / 2;

            if (list.get(mid).power < power) {
                pl = mid + 1;
            } else {
                pr = mid;
            }
        }
        return list.get(pr).name;
    }
}

