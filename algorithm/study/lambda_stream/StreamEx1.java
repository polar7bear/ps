package algorithm.study.lambda_stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamEx1 {
    public static void main(String[] args) {
        //배열로부터 스트림 생성
        Integer[] wrapperIntArr = {1, 2, 3, 4, 5};
        Stream<Integer> wrapperIntArrToStream = Arrays.stream(wrapperIntArr); //스트림은 결과값을 담고있진 않음.

        //스트림을 다시 배열로
        var streamToArray = wrapperIntArrToStream.toArray();

        //만약 intArr의 타입이 wrapper클래스가 아닌 primitive 타입인 int 배열이라면
        //스트림으로 변환할 때 IntStream 으로 타입을 변경해주면 됨.
        int[] priIntArr = {1, 2, 3, 4, 5};
        IntStream priIntArrToIntStream = Arrays.stream(priIntArr);
        var streamToArray2 = priIntArrToIntStream.toArray();

        // 스트림은 한 번 사용하면 끝. (흘러가버린 물)
        //var ifReuse = fromArr.toArray();

        //Builder로 Stream 생성하기
        Stream.Builder<Character> builder = Stream.builder();
        builder.accept('스');
        builder.accept('트');
        builder.accept('림');
        builder.accept('빌');
        builder.accept('더');
        //accept 대신 add로 해보니깐 add도 됨
        Stream<Character> withBuilder = builder.build();
        var withBuilderToArr = withBuilder.toArray();


        //이터레이터로 생성
        Stream<Integer> withIter1 = Stream
                .iterate(0, i -> i + 2)
                .limit(10);

        var withIter1ToArr = withIter1.toArray();

        Stream<String> withIter2 = Stream
                .iterate("홀", s -> s + (s.endsWith("홀") ? "짝" : "홀"))
                .limit(8);
        var withIter2ToArr = withIter2.toArray();

        //primitive 자료형 스트림의 기능으로 생성하기
        IntStream fromRange1 = IntStream.range(10, 20); //20 미포함
        IntStream fromRange2 = IntStream.rangeClosed(10, 20); //20 포함

        //primitive 자료형을 참조형(Wrapper)으로 변환시킬때는 boxed() 사용
        Stream<Integer> priToWrapper = fromRange1.boxed();

        var priToWrapperArr = priToWrapper.toArray();

        //Random 클래스로 생성하기
        //new Random().ints(개수, 시작, 끝);
        IntStream randomInts = new Random().ints(5, 0, 100);
        var randomIntsToArr = randomInts.toArray();

        DoubleStream randomDoubles = new Random().doubles(5, 0, 1);
        var randomDoublesToArr = randomDoubles.toArray();

        //파일로부터 생성하기
        Stream<String> fromFile;
        Path path = Paths.get("./src/lambda_stream/greeting.txt");
        try {
            fromFile = Files.lines(path);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        var fromFileToArr = fromFile.toArray();

         //빈 스트림 생성
        //스트림을 받는 메서드 등에서 종종 사용
        Stream<Integer> emptyIntStream = Stream.empty();
    }
}
