import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //국가의 개수
        int k = Integer.parseInt(st.nextToken()); //등수를 알고싶은 국가

        int rank = 1;

        List<Country> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            list.add(new Country(id, gold, silver, bronze));
        }

        Collections.sort(list);
        int cnt = 1;

        if(list.get(0).id == k) {
            System.out.println(1);
            System.exit(0);
        }
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i-1).compareTo(list.get(i)) != 0) {
                rank += cnt;
                cnt = 1;
            } else {
                cnt++;
            }

            if(list.get(i).id == k) {
                System.out.println(rank);
                break;
            }
        }
    }

    static class Country implements Comparable<Country> {
        int id, gold, silver, bronze;

        public Country(int id, int gold, int silver, int bronze) {
            this.id = id;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Country o) {
            if(gold != o.gold) {
                return o.gold - gold;
            }
            else if(silver != o.silver) {
                return o.silver - silver;
            } else {
                return o.bronze - bronze;
            }
        }
    }
}

