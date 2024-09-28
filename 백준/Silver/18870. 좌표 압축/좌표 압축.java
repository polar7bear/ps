import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; // 원본 배열
        int[] sorted = new int[n]; // 정렬된 배열
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i];
        }

        // 배열 오름차순으로 정렬하고 중복제거
        int[] unique = Arrays.stream(sorted).sorted().distinct().toArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int idx = Arrays.binarySearch(unique, arr[i]);
            sb.append(idx + " ");
        }
        System.out.println(sb);
    }
}