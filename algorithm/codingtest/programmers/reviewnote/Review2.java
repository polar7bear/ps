package algorithm.codingtest.programmers.reviewnote;

import java.util.Arrays;

public class Review2 {
    public int solution3(int[] A, int[] B) {
        //각 배열에서 각 숫자를 뽑아 곱하는 것을 배열의 길이만큼(3번) 반복한다. 그리고 최적의 낮은 수를 출력해라
        //배열 하나에서는 가장 낮은 수를 선택하고 또 다른 배열에서는 가장 높은수를 선택하여 두 수를 곱하는것이 가장 최적의 해일것임.
        //가장 낮은 수를 선택하는 배열은 오름차순, 높은 수를 선택하는 배열은 내림차순을 해보자
        //예를 들어, 1 x 5, 4 x 4, 4 x 2 최적의 해는 29이다. 이것만 봐도 그리디 알고리즘 문제라는 것을 추측 해볼 수 있음.
        //그리고 한번씩만 뽑아 곱할 수 있음.
        int sum = 0;
        int min = B[0];

        //오름차순은 sort 메서드를 사용하자..
        Arrays.sort(A);

        //배열 b 내림차순 (버블정렬)
        //시간초과..
        //플랜 b로는 b도 a와 같이 오름차순 정렬하여 b의 마지막 요소부터 거꾸로 곱해주자 ps. 속도가 느린 버블정렬말고 비교적 빠른 선택, 삽입 정렬 등을 배워보자..
        /*for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] < b[j + 1]) {
                    min = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = min;
                }
            }
        }*/

        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[B.length - 1 - i];
        }
        return sum;
    }
}
