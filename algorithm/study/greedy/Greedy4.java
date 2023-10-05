package algorithm.study.greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = 0; //현재 그룹에 포함된 모험가의 수
        int result = 0; //총 그룹의 수
        int n = sc.nextInt();   //모험가 수 입력
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());    //모험가 수에 따른 각 공포도 입력
        }
        Collections.sort(arrayList);    //오름차순 정렬

        for(int i = 0; i < n; i++) {
            count += 1;     //현재 그룹에 해당 모험가를 포함시키기
            if(count >= arrayList.get(i)) {
                result += 1;    // 총 그룹의 수 증가시키기
                count = 0;  //현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        System.out.println(result);
    }
}
