package algorithm.codingtest.programmers;

import java.util.Arrays;

public class ProgrammersLv1 {

    int solution(int n) {
        //나머지가 1이 되는 수 찾기
        int i = 1;
        boolean lim = n >= 3 && n <= 1000000;
        if (lim) {
            while (true) {
                if (n % i == 1) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i;
    }

    int solution1(int n) {
        //자릿수 더하기
        int answer = 0;
        String[] arr = String.valueOf(n).split("");
        int[] intArr = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : intArr) {
            answer += i;
        }

        return answer;
    }

    int solution2(int n) {
        //약수의 합
        int answer = 0;
        boolean lim = n >= 0 && n <= 3000;
        if (lim) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
        }
        return answer;
    }

    long[] solution3(int x, int n) {
        //x만큼 간격이 있는 n개의 숫자
        long[] answer = new long[n];
        boolean lim = x >= -10000000 && x <= 10000000 && n <= 1000;
        if (lim) {
            for (int i = 0, j = 1; i < n; i++, j++) {
                answer[i] = ((long) x * j);
            }
        }
        return answer;
    }

    int[] solution4(long n) {
        //자연수 뒤집어 배열로 만들기
        StringBuffer sb = new StringBuffer();
        String str = String.valueOf(sb.append(n).reverse());

        String[] strArr = str.split("");

        int[] answer = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();
        return answer;
    }

    boolean solution5(String s) {
        //문자열 내 p와 y의 개수
        String[] strArr = s.split("");
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("p") || strArr[i].contains("P")) {
                sum1 += 1;
            } else if (strArr[i].contains("y") || strArr[i].contains("Y")) {
                sum2 += 1;
            }
        }
        boolean answer = (sum1 == sum2) ? true : false;

        return answer;
    }

    long solution6(long n) {
        //정수 제곱근 판별
        long answer = (long) Math.sqrt(n);

        if (n == Math.pow(answer, 2)) {  //answer * answer
            answer = (long) Math.pow(answer + 1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }

    long solution7(long n) {
        //정수 내림차순 정렬
        String[] strArr = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strArr);

        for(String i : strArr) sb.append(i);
        long result = Long.parseLong(sb.reverse().toString());

        return result;
    }

    boolean solution8(int x) {
        //하샤드 수 (x의 자릿수 합으로 x가 나누어진다면 그것은 하샤드 수이다. 하샤드 수이면 true 아니라면 false를 return)
        boolean answer = true;
        int sum = 0;
        String[] strArr = String.valueOf(x).split("");

        int[] intArr = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < intArr.length; i++) {
            sum += intArr[i];

            if(x % sum == 0) answer = true;
            else answer = false;
        }
        return answer;
    }

}
