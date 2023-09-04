package algorithm.method;

public class Practice {
    public static void main(String[] args) {
        //        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int hour = Integer.parseInt(br.readLine());
//        System.out.println(hour);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello ").append("World");
        sb.insert(6, "Java ");   //해당 인덱스 앞에다가 추가
        sb.setCharAt(6, 'C');   //해당 인덱스 문자를 치환
        sb.setCharAt(7, 'o');
        sb.setCharAt(8, 'l');
        sb.setCharAt(9, 'e');
        sb.delete(6, 11);   //시작인덱스, 끝인덱스(끝인덱스 포함X)까지 문자열삭제
        sb.reverse();   //문자열 뒤집기
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi").append(" World");
        stringBuilder.insert(3, "Spring ");
        stringBuilder.delete(0, 3);
        System.out.println(stringBuilder);
        //StringBuffer 클래스는 멀티스레드 환경에서 안정적이게 사용할 수 있도록 동기화
        // 되어 있으므로, 스레드 안정성이 필요한 경우에 사용할 수 있다.
        // 하지만 단일 스레드 환경에서는 StringBuilder 클래스를 사용하는 것이 효율적일 수 있음.
        // 두 클래스의 사용법은 거의 비슷함.
    }
}
