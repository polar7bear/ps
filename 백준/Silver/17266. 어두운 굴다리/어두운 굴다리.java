import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 굴다리의 길이
        int m = Integer.parseInt(br.readLine()); // 가로등의 개수
        ArrayList<Integer> lights = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            lights.add(Integer.parseInt(st.nextToken()));
        }

        int maxDistance = Math.max(lights.get(0), n - lights.get(m - 1)); // 시작과 끝 지점 처리
        for (int i = 1; i < lights.size(); i++) {
            maxDistance = Math.max(maxDistance, (lights.get(i) - lights.get(i - 1) + 1) / 2); // 인접 가로등 사이 거리
        }

        System.out.println(maxDistance);
    }
}
