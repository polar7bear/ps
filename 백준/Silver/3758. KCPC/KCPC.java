import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //팀의 개수
            int k = Integer.parseInt(st.nextToken()); //문제 개수
            int t = Integer.parseInt(st.nextToken()); //나의 팀 번호
            int m = Integer.parseInt(st.nextToken()); //로그 개수

            Map<Integer, Team> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int teamId = Integer.parseInt(st.nextToken());
                int problem = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());

                Team team = map.getOrDefault(teamId, new Team(teamId));
                team.update(problem, score, i);
                map.put(teamId, team);
            }
            List<Team> teams = new ArrayList<>(map.values());
            Collections.sort(teams);

            for (int i = 0; i < teams.size(); i++) {
                if (teams.get(i).id == t) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }

    private static class Team implements Comparable<Team> {
        int[] scores;
        int id, cnt, lastTime;

        private Team(int id) {
            this.id = id;
            this.scores = new int[101];
            this.cnt = 0;
            this.lastTime = 0;
        }

        private void update(int problem, int score, int time) {
            scores[problem] = Math.max(scores[problem], score);
            cnt++;
            lastTime = time;
        }

        public int totalScore() {
            return Arrays.stream(scores).sum();
        }

        @Override
        public int compareTo(Team o) {
            if (this.totalScore() != o.totalScore()) {
                return o.totalScore() - this.totalScore();
            } else if (this.cnt != o.cnt) {
                return this.cnt - o.cnt;
            } else {
                return this.lastTime - o.lastTime;
            }
        }
    }
}

