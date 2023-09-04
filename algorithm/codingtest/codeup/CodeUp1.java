package algorithm.codingtest.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1 {

    public void codeUp1018() throws IOException {
        //1018 시간 입력받아 그대로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        System.out.println(time);
        br.close();
    }

    public void codeUp1019() throws IOException {
        //1019 연월일 입력받아 그대로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());
        System.out.printf("%04d.%02d.%02d", year, month, date);
    }

    public void codeUp1020() throws IOException {
        //1020 주민번호 입력받아 형태 바꿔 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        System.out.printf("%s%s", arr[0], arr[1]);
    }

    public void codeUp1021() throws IOException {
        //1021 단어 1개 입력받아 그대로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[] = br.readLine().toCharArray();
        System.out.println(arr);
    }

    public void codeUp1023() throws Exception {
        //1023 실수 1개입력받아 부분별로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split("\\.");
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        System.out.printf("%d\n%d", arr2[0], arr2[1]);

        //Integer arr2[] = Stream.of(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer::new);

        //System.out.printf("%d\n%d", arr2[0], arr2[1]);
    }

    public void codeUp1024() throws IOException {
        //1024 단어 1개 입력받아 나누어 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a[] = br.readLine().toCharArray();

        for (char i : a) {
            System.out.println("'" + i + "'");
        }
    }

    public void codeUp1025() throws IOException {
        //정수 1개 입력받아 나누어 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a[] = br.readLine().toCharArray();
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(String.valueOf(a[i]));
        }
        b[0] *= 10000;
        b[1] *= 1000;
        b[2] *= 100;
        b[3] *= 10;
        for (int i : b) {
            System.out.println("[" + i + "]");
        }
    }

    public void codeUp1026() throws IOException {
        //1026 시분초 입력받아 분만 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(":");
        if (a[1].equals("00")) {
            a[1] = "0";
        }
        System.out.println(a[1]);
    }

}
