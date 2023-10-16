package algorithm.codingtest.programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

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

    long solution9(int a, int b) {
        //두 정수 사이의 합
        //ps. 등차수열 합 공식
        //(b - a + 1) * (a + b) / 2
        long answer = 0;

        if(a <= b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        } else if(a >= b) {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

    int solution10(int num) {
        //콜라츠 추측
        int cnt = 0;
        long answer = num;

        if (num == 1) cnt = 0;
        while (true) {
            if (answer == 1) break;

            if (answer % 2 == 0) {
                answer /= 2;
                cnt++;
            } else if (answer % 2 != 0 && answer >= 2) {
                answer = answer * 3 + 1;
                cnt++;
            }
            if (cnt >= 500) {
                cnt = -1;
                break;
            }
        }
        return cnt;
    }

    String solution11(String[] seoul) {
        //서울에서 김서방 찾기
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].contains("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    int[] solution12(int[] arr, int divisor) {
        //나누어 떨어지는 숫자 배열
        int j = 0;
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                j++;
            }
        }

        if(j == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[j];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    int solution13(int[] absolutes, boolean[] signs) {
        //음양 더하기
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                absolutes[i] *= 1;
            } else if(signs[i] == false) {
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    String solution14(String phone_number) {
        //핸드폰 번호 가리기
        StringBuilder sb = new StringBuilder();

        String star = phone_number.substring(0, phone_number.length() - 4);
        String last4 = phone_number.substring(phone_number.length() - 4, phone_number.length());

        for(int i = 0; i < star.length(); i++) {
            sb.append("*");
        }
        return sb + last4;
    }

    int[] solution15(int[] arr) {
        //제일 작은 수 제거하기
        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        if(arr.length <= 1) {
            int[] tmp = {-1};
            return tmp;
        }

        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        for(int i = 0, k = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                answer[k] = arr[i];
                k++;
            }
        }
        return answer;
    }

    String solution16(String s) {
        //가운데 글자 가져오기
        String answer = "";
        int idx = s.length() / 2;

        if(s.length() % 2 != 0) {
            answer = s.substring(idx, idx + 1);
        } else {
            answer = s.substring(idx - 1, idx + 1);
        }
        return answer;
    }

    String solution17(int n) {
        //수박수박수박수박수?
        StringBuilder sb = new StringBuilder();
        String a = "수", b = "박";

        for(int i = 1; i <= n; i++) {
            sb.append(a).append(b);
        }

        return sb.substring(0, n);
    }

    int solution18(int[] a, int[] b) {
        //내적
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    int solution19(int left, int right) {
        //약수의 개수와 덧셈
        int cnt = 0;
        int sum = 0;

        for(int i = left; i <= right; i++) {
            cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }

    String solution20(String s) {
        //문자열 내림차순으로 배치하기
        //버블정렬 활용했음
        char[] arr = s.toCharArray();
        char tmp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <arr.length - i - 1; j++) {
                if(arr[j] < arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return new String(arr);
    }

    long solution21(int price, int money, int count) {
        //부족한 금액 계산하기
        long charge = 0;

        for(int i = 1; i <= count; i++) charge += price * i;
        if(money > charge) return 0;

        long answer = charge - money;
        return answer;
    }

    boolean solution22(String s) {
        //문자열 다루기 기본
        boolean answer = true;
        char[] arr = s.toCharArray();

        if(arr.length == 4 || arr.length == 6) {
            for(char c : arr) {
                if(c < '0' || c > '9') {
                    return false;
                }
            }
        } else {
            return false;
        }
        return answer;
    }

    int[][] solution23(int[][] arr1, int[][] arr2) {
        //행렬의 덧셈
        int[][] answer = new int[arr1.length][arr1[0].length];
        int i = 0, j = 0;
        int plus = 0;

        for(i = 0; i < arr1.length; i++) {
            for(j = 0; j < arr1[i].length; j++) {
                plus = arr1[i][j] + arr2[i][j];
                answer[i][j] = plus;
            }
        }
        return answer;
    }

    void solution24() {
        //직사각형 별 찍기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    int[] solution25(int []arr) {
        //같은 숫자는 싫어
        int[] answer = {};
        Stack<Integer> s = new Stack<>();

        for(int i : arr) {
            if(s.isEmpty()) s.push(i);
            else if(s.peek() != i) s.push(i);   //중복 요소 제거
        }

        answer = new int[s.size()];

        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = s.pop();    //스택은 꼭대기부터 요소를 pop 해야하므로 인덱스 가장 마지막부터 선형검색
        }

        return answer;
    }

    int solution26(int n) {
        //3진법 뒤집기
        int answer = 0;
        int count = 0;
        Stack<Integer> s = new Stack<>();

        while(n > 0) {
            count++;
            s.push(n % 3);
            n /= 3;
        }

        for(int i = 0; i < count; i++) {
            answer += s.pop() * Math.pow(3, i);
        }
        return answer;
    }

    int solution27(int[] d, int budget) {
        //예산 (정해진 총 예산으로 각 부서마다 필요한 예산에 따라 최대한 지원해 줄 수 있는 부서의 개수를 구하는 것이므로 그리디 알고리즘이란 것을 추측해볼 수 있었음.)
        int answer = 0;
        int result = 0;
        int tmp = 0;

        //오름차순 버블정렬 (오름차순으로 정렬을 하는 이유는 최대한 많은 부서를 지원 해주어야 하기 때문에 필요한 예산이 적은 부서 순서대로 오름차순 정렬을 해주었음)
        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d.length - i - 1; j++) {
                if(d[j] > d[j+1]) {
                    tmp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i < d.length; i++) {
            if(answer + d[i] > budget) break;
            answer += d[i];
            result++;
        }
        return result;
    }

    int solution28(String t, String p) {
        //크기가 작은 부분문자열
        int answer = 0;

        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            if (Long.parseLong(t.substring(i, p.length() + i)) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }

    int solution29(int[] number) {
        //삼총사
        int answer = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }

    int solution30(int[][] sizes) {
        //최소직사각형
        int prevMax = 0;
        int prevMin = 0;
        for(int[] size : sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);

            prevMax = Math.max(curMax, prevMax);
            prevMin = Math.max(curMin, prevMin);
        }
        return prevMax * prevMin;
    }
}
