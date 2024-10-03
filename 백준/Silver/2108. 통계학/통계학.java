import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int sum = Arrays.stream(arr).sum();
        System.out.println(Math.round((float) sum / n));
        System.out.println(arr[arr.length / 2]);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue().compareTo(a.getValue()); // 빈도가 큰 순서대로 정렬
            } else {
                return a.getKey().compareTo(b.getKey()); // 값이 작은 순서대로 정렬
            }
        });

        // 최빈값 중 두 번째로 작은 값 출력
        if (entryList.size() > 1 && entryList.get(0).getValue().equals(entryList.get(1).getValue())) {
            System.out.println(entryList.get(1).getKey());
        } else {
            System.out.println(entryList.get(0).getKey());
        }
        System.out.println(arr[n - 1] - arr[0]);

    }
}