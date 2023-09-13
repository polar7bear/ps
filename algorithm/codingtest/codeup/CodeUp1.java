package algorithm.codingtest.codeup;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

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

    public void codeUp1027() throws IOException {
        //1027 년원일 입력받아 형식 바꿔 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("\\.");
        String[] b = new String[a.length];

        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            b[j] = a[i];
        }
        String c = String.join("-", b);
        System.out.println(c);
    }

    public void codeUp1028() throws IOException {
        //정수 1개 입력받아 그대로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        System.out.println(a);
    }

    public void codeUp1029() throws IOException {
        //1029 실수 1개 입력받아 그대로 출력하기  (소수점 이하 11자리까지 출력)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());

        System.out.printf("%.11f", a);
    }

    public void codeUp1030() throws IOException {
        //1030 정수 1개 입력받아 그대로 출력하기3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        System.out.println(a);
    }

    public void codeUp1031() throws IOException {
        //1031 10진 정수 1개 입력받아 8진수로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.printf("%o", a);
    }

    public void codeUp1032() throws IOException {
        //1032 10진 정수 입력받아 16진수로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.printf("%x", a);
    }

    public void codeUp1033() throws IOException {
        //10진 정수 입력받아 16진수 대문자로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.printf("%X", a);
    }

    public void codeUp1034() throws IOException {
        //8진 정수 1개 입력받아 10진수로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        int b = Integer.parseInt(a, 8);
        System.out.printf("%d", b);
    }

    public void codeUp1035() throws IOException {
        //16진수 정수 1개 입력받아 8진수로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        int b = Integer.parseInt(a, 16);
        System.out.printf("%o", b);
    }

    public void codeUp1036() throws IOException {
        //영문자 1개 입력받아 10진수로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.read();
        System.out.println(a);
    }

    public void codeUp1037() throws IOException {
        //정수 입력받아 아스키문자로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short a = Short.parseShort(br.readLine());
        char b = (char) a;
        System.out.println(b);
    }

    public void codeUp1038() throws IOException {
        //1038 정수 2개 입력받아 합 출력하기1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        long[] b = new long[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = Long.parseLong(a[i]);
        }
        System.out.println(b[0] + b[1]);
    }

    public void codeUp1040() throws IOException {
        //정수 1개 입력받아 부호 바꿔 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println(a * -1);
    }

    public void codeUp1041() throws IOException {
        //문자 1개 입력받아 다음 문자 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = (char) br.read();

        System.out.println((char) (a + 1));
    }

    public void codeUp1042() throws IOException {
        //정수 2개 입력받아 나눈 몫 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        System.out.println(b[0] / b[1]);
    }

    public void codeUp1043() throws IOException {
        //정수 2개 입력받아 나눈 나머지 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        System.out.println(b[0] % b[1]);
    }

    public void codeUp1044() throws IOException {
        //정수 1개 입력받아 1 더해 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        System.out.println(a + 1);
    }

    public void codeUp1045() throws IOException {
        //정수 2개 입력받아 자동 계산하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();   //문자열 배열을 정수 배열로 변환 (for문을 쓰지 않은 방식)

        System.out.println(b[0] + b[1]);
        System.out.println(b[0] - b[1]);
        System.out.println(b[0] * b[1]);
        System.out.println(b[0] / b[1]);
        System.out.println(b[0] % b[1]);
        System.out.printf("%.2f", ((float) b[0] / b[1]));
    }

    public void codeUp1046() throws IOException {
        //정수 3개 입력받아 합과 평균 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();   //문자열 배열을 정수 배열로 변환 (for문을 쓰지 않은 방식)
        int sum = b[0] + b[1] + b[2];
        float avg = ((float) sum / b.length);

        System.out.printf(sum + "\n" + "%.1f", avg);
    }

    public void codeUp1048() throws IOException {
        //한 번에 2의 거듭제곱 배로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        //자바의 경우 제곱 연산자가 없기때문에 Math 클래스의 pow(밑, 지수) 메서드를 사용해야함.
        System.out.println(b[0] * (int) Math.pow(2, b[1]));
    }

    public void codeUp1049() throws IOException {
        //두 정수 입력받아 비교하기1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        int i = (b[0] > b[1]) ? 1 : 0;
        System.out.println(i);
    }

    public void codeUp1051() throws IOException {
        //두 정수 입력받아 비교하기3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        int result = (b[0] <= b[1]) ? 1 : 0;
        System.out.println(result);
    }

    public void codeUp1052() throws IOException {
        //두 정수 입력받아 비교하기4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        int result = (b[0] != b[1]) ? 1 : 0;
        System.out.println(result);
    }

    public void codeUp1053() throws IOException {
        //참 거짓 바꾸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        boolean bool = a == 0 || a == 1;

        if (bool) {
            if (a == 1) {
                a = 0;
                System.out.println(a);
            } else {
                a = 1;
                System.out.println(a);
            }
        }
    }

    public void codeUp1054() throws IOException {
        //둘 다 참일 경우만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        boolean b1 = b[0] == b[1];

        if (b[0] == 0 && b[1] == 0) {
            b1 = false;
        }
        int result = (b1) ? 1 : 0;
        System.out.println(result);
    }

    public void codeUp1055() throws IOException {
        //하나라도 참이면 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        boolean b1 = b[0] != b[1];
        if (b[0] == b[1]) {
            b1 = true;
        }
        if (b[0] == 0 && b[1] == 0) {
            b1 = false;
        }
        int result = (b1) ? 1 : 0;
        System.out.println(result);
    }

    public void codeUp1056() throws IOException {
        //참/거짓이 서로 다를 때에만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        //두 수가 서로 다르면 1, 같으면 0을 출력
        boolean b1 = b[0] == b[1];
        if (b1) {
            b1 = true;
        } else if (b[0] != b[1]) {
            b1 = false;
        }

        int result = (b1) ? 0 : 1;
        System.out.println(result);
    }

    public void codeUp1057() throws IOException {
        //참/거짓이 서로 같을 때에만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        boolean b1 = b[0] == b[1];
        if (b1) {
            b1 = true;
        } else if (b[0] != b[1]) {
            b1 = false;
        }

        int result = (b1) ? 1 : 0;
        System.out.println(result);
    }

    public void codeUp1058() throws IOException {
        //둘 다 거짓일 경우만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        //두 수가 거짓일 경우에만 참(1)을 출력
        boolean b1 = b[0] == 0 && b[1] == 0;

        int result = (b1) ? 1 : 0;
        System.out.println(result);
    }

    public void codeUp1059() throws IOException {
        //비트단위로 NOT하여 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(~a); //~연산자는 2의 보수를 반환
    }

    public void codeUp1060() throws IOException {
        //비트단위로 AND 하여 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        // & (AND)연산자는 각각의 이진수에서 두 수 모두 1인 자리만 1로 만들어줌.
        System.out.println(b[0] & b[1]);
    }

    public void codeUp1061() throws IOException {
        //비트단위로 OR 하여 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        // | (OR)연산자는 각각의 이진수에서 둘 중 하나라도 1인 자리를 1로 만들어줌.
        System.out.println(b[0] | b[1]);
    }

    public void codeUp1062() throws IOException {
        //비트단위로 XOR 하여 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        //^ (XOR)연산자는 각각의 이진수중에서 둘 중 서로 다른자리만 1로 만들어줌.(같은자리는 0이겠죠?)
        System.out.println(b[0] ^ b[1]);
    }

    public void codeUp1063() throws IOException {
        //두 정수 입력받아 큰 수 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        int result = (b[0] > b[1]) ? b[0] : b[1];
        //int result = Math.max(b[0], b[1]); Math 클래스의 max() 메서드를 사용해도됨.

        System.out.println(result);
    }

    public void codeUp1064() throws IOException {
        //정수 3개 입력받아 가장 작은 수 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        int min = 0;
        if (b[0] > b[1] && b[2] > b[1]) {
            min = b[1];
        } else if (b[1] > b[2] && b[0] > b[2]) {
            min = b[2];
        } else {
            min = b[0];
        }

        System.out.println(min);
    }

    public void codeUp1065() throws IOException {
        //정수 3개 입력받아 짝수만 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                System.out.println(b[i]);
            }
        }
    }

    public void codeUp1066() throws IOException {
        //정수 3개 입력받아 짝/홀 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                System.out.println("even");
            } else if (b[i] % 2 == 1) {
                System.out.println("odd");
            }
        }
    }

    public void codeUp1067() throws IOException {
        //정수 1개 입력받아 분석하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 0) {
            System.out.println("plus");
        } else if (a < 0) {
            System.out.println("minus");
        }
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public void codeUp1068() throws IOException {
        //정수 1개 입력받아 평가 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        boolean lim = 100 >= a && a >= 0;
        if (lim) {
            if (a >= 90) {
                System.out.println("A");
            } else if (a >= 70) {
                System.out.println("B");
            } else if (a >= 40) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }

    public void codeUp1069() throws IOException {
        //평가 입력받아 다르게 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = (char) br.read();
        switch (a) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }

    public void codeUp1070() throws IOException {
        //월 입력받아 계절 출력하기 (원래는 switch문을 사용하라고 힌트가 있었지만, 좀 색다른 방법으로 풀어보고자 하여 2차원배열로 풀어보았다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        //                   겨울        봄        여름         가을
        int[][] season = {{12, 1, 2}, {3, 4, 5}, {6, 7, 8}, {9, 10, 11}};

        for (int i = 0; i < season.length; i++) {   //1차 배열 인덱스 접근
            if (IntStream.of(season[i]).anyMatch(s -> s == a)) {    //만약 1차배열중 입력받은 숫자가 포함되면
                if (season[i] == season[0]) {
                    System.out.println("winter");
                } else if (season[i] == season[1]) {
                    System.out.println("spring");
                } else if (season[i] == season[2]) {
                    System.out.println("summer");
                } else if (season[i] == season[3]) {
                    System.out.println("fall");
                }
            }
        }
    }

    public void codeUp1071() throws IOException {
        //0 입력될 때까지 무한 출력하기1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        int[] intArr = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : intArr) {
            if (i == 0) break;
            System.out.println(i);
        }
    }

    class codeUp1072 {
        //1072 정수 입력받아 계속 출력하기
        public BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        public StringTokenizer st;

        void answer(int cnt) throws IOException {
            bw.write(st.nextToken());
            bw.newLine();

            if (cnt > 1) { //재귀 함수
                answer(cnt - 1);
            }
        }

        public void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String cnt = br.readLine();
            String str = br.readLine();
            st = new StringTokenizer(str, " "); //공백을 기준으로 한 개의 토큰으로
            answer(st.countTokens());                 // 토큰의 개수
            bw.flush();
        }
    }

    public void codeUp1073() throws IOException {
        //1073 0 입력될 때까지 무한 출력하기2
        //1071 문제와 비슷하지만 이 문제는 while 문과 BufferedWriter, StringTokenizer를 사용 해보았음.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            String token = st.nextToken();  //nextToken()을 변수에 담고 while문 안에 포함 시켜줘야 함.
            if(token.equals("0")) break;
            bw.write(token);
            bw.newLine();
        }
        bw.flush();
    }

    public void codeUp1074() throws IOException {
        //정수 1개 입력받아 카운트다운 출력하기1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        while(a >= 1) {
            System.out.println(a);
            a -= 1;
        }
    }

    public void codeUp1075() throws IOException {
        //정수 1개 입력받아 카운트다운 출력하기2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        while(a != 0) {
            a -= 1;
            System.out.println(a);
        }
    }

    public void codeUp1076() throws IOException {
        //문자 1개 입력받아 알파벳 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char b = (char) br.read();

        for(char i = 'a'; i <= b; i++) {
            System.out.printf("%c" + " ", i);
        }
    }

    public void codeUp1077() throws IOException {
        //정수 1개 입력받아 그 수까지 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }

    public void codeUp1078() throws IOException {
        //짝수 합 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            if(i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }

    public void codeUp1079() throws IOException {
        //원하는 문자가 입력될 때까지 반복 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        char[] charArr = new char[st.countTokens()];

        for(int i = 0; st.hasMoreTokens(); i++) {
            String token = st.nextToken();
            charArr[i] = token.charAt(0);

            System.out.println(charArr[i]);
            if(charArr[i] == 'q') break;
        }
    }

    public void codeUp1080() throws IOException {
        //언제까지 더해야 할까?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i < a; i++) {
            sum += i;
            if (sum >= a) {
                System.out.println(i);
                break;
            }
        }
    }

    public void codeUp1081() throws IOException {
        //주사위 2개를 던지면?
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }

    public void codeUp1082() throws IOException {
        //16진수 구구단
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(16); // nextInt(16) 16진법으로 받아올 수 있음.

        for(int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", a, i, a * i);
        }
    }

    public void codeUp1083() throws IOException {
        //3 6 9 게임의 왕이 되자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public void codeUp1084() throws IOException {
        //빛 섞어 색 만들기
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //3중 for문으로 인해 메모리 효율을 높이기 위해 sout 대신 BufferedWriter 클래스 사용.

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    String str = i + " " + j + " " + k;
                    bw.write(str + "\n");
                    cnt++;
                    bw.flush();
                }
            }
        }
        bw.write(Integer.toString(cnt));
        bw.close();
    }

    public void codeUp1085() throws IOException {
        //소리 파일 저장 용량 계산하기
        Scanner sc = new Scanner(System.in);

        long hrz = sc.nextInt();
        long bit = sc.nextInt();
        long channel = sc.nextInt();
        long sec = sc.nextInt();

        double fileSize = (double) (hrz * bit * channel * sec) / 8 / 1024 / 1024;

        System.out.printf("%.1f MB", fileSize);
    }

    public void codeUp1086() throws IOException {
        //그림 파일 저장 용량 계산하기
        Scanner sc = new Scanner(System.in);

        long pix1 = sc.nextInt();
        long pix2 = sc.nextInt();
        long bit = sc.nextInt();

        double fileSize = (double) (pix1 * pix2 * bit) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB", fileSize);
    }

    public void codeUp1087() throws IOException {
        //여기까지! 이제 그만~
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
            if (sum >= a) break;
        }
        System.out.println(sum);
    }

    public void codeUp1088() throws IOException {
        //3의 배수는 통과?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i <= a; i ++) {
            if(i % 3 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public void codeUp1089() throws IOException {
        //수 나열하기1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i < c; i++) {
            a += (a + b) - a;
        }
        System.out.println(a);
    }

    public void codeUp1090() throws IOException {
        //수 나열하기2
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        //2부터 시작해서 3씩 곱한 7번째 수가 무엇인지?

        long result = a;
        for (int i = 1; i < c; i++) {
            result *= b;
        }
        System.out.println(result);
    }

    public void codeUp1091() throws IOException {
        //수 나열하기3
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long result = a;
        for (int i = 1; i < d; i++) {
            result = result * b + c;
        }
        System.out.println(result);
    }

    public void codeUp1092() throws IOException {
        //함께 문제 푸는 날
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int day = 1;

        while(day % a != 0 || day % b != 0 || day % c != 0) {
            day++;
        }
        System.out.println(day);
    }
}
