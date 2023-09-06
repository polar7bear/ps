package algorithm.codingtest.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

        if(b[0] == 0 && b[1] == 0) {
            b1 = false;
        }
        int result = (b1) ?1 :0;
        System.out.println(result);
    }

    public void codeUp1055() throws IOException {
        //하나라도 참이면 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        boolean b1 = b[0] != b[1];
        if(b[0] == b[1]) {
            b1 = true;
        }
        if(b[0] == 0 && b[1] == 0) {
            b1 = false;
        }
        int result = (b1) ?1 :0;
        System.out.println(result);
    }

    public void codeUp1056() throws IOException {
        //참/거짓이 서로 다를 때에만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        //두 수가 서로 다르면 1, 같으면 0을 출력
        boolean b1 = b[0] == b[1];
        if(b1) {
            b1 = true;
        } else if(b[0] != b[1]) {
            b1 = false;
        }

        int result = (b1) ?0 :1;
        System.out.println(result);
    }

    public void codeUp1057() throws IOException {
        //참/거짓이 서로 같을 때에만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        boolean b1 = b[0] == b[1];
        if(b1) {
            b1 = true;
        } else if(b[0] != b[1]) {
            b1 = false;
        }

        int result = (b1) ?1 :0;
        System.out.println(result);
    }

    public void codeUp1058() throws IOException {
        //둘 다 거짓일 경우만 참 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

        //두 수가 거짓일 경우에만 참(1)을 출력
        boolean b1 = b[0] == 0 && b[1] == 0;

        int result = (b1) ?1 :0;
        System.out.println(result);
    }
}
