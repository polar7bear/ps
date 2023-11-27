package algorithm.study.lambda_stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamAction {
    public static void main(String[] args) {

        //스트림 활용해보기
        IntStream
                .range(1, 100)
                .filter(i -> i % 2 == 0)
                .skip(10)    //1부터 99까지 짝수를 출력하되, 앞의 10개는 생략
                .limit(10) //최대 10개까지만
                .map(i -> i * 10) //그 결과에 10씩 곱한 결과로 map
                .forEach(System.out::println);

        System.out.println("-----");
        //2
        String str = "Hello My name is bear";
        //chars() 메서드는 문자열을 IntStream으로 변환해주는 메서드
        str.chars().forEach(System.out::println);

        char strMaxChar = (char) str.chars()
                .max()
                //.min()
                .getAsInt();

        System.out.println("-----");
        //중복제거하고 아스키코드 순으로 오름차순 정렬하기
        str.chars()
                .sorted() // 오름차순 정렬하고
                .distinct() // 중복제거 하고
                //.filter(i -> (65 <= i && i <= 90) || (97 <= i && i <= 122)) //알파벳 범위인 것들만 골라내서
                .filter(Character::isLetter) //더 쉽게 문자인지로 판별
                .forEach(i -> System.out.print((char) i)); // 출력한다


        //boxed() -> primitive 타입을 Wrapper타입으로 변환 시켜야 할 때
        String fromStr = str.chars()
                .boxed()
                .map(i -> String.valueOf((char) i.intValue()))
                .map(String::toUpperCase)
                .filter(s -> Character.isLetter(s.charAt(0)))
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));

        //peek() -> 데이터에 영향을 주지않고 들여다만 보는 메서드 스택이나 큐의 peek 과 유사한듯?
        String peek = IntStream.range(0, 10)
                .boxed()
                .peek(i -> System.out.print("peek : " + i))
                .filter(i -> i % 2 == 1)
                .peek(i -> System.out.println("filter 후 : " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("제곱 후 : " + i))
                .sorted((i1, i2) -> i1 < i2 ? 1 : -1)
                .peek(i -> System.out.println("내림차순 정렬 : " + i))
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        //allMatch // anyMatch (모든 요소가 / 어느 한 요소라도)
        //주어진 Predicate에 부합하는지 boolean값으로 반환
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean intsMatch = Arrays.stream(intArr)
                //.allMatch(i -> i > 0)
                //.anyMatch(i -> i > 0)
                .allMatch(i -> i % 2 == 0);

        //takeWhile // dropWhile (주어진 Predicate을 충족시킬 때까지 취합 / 건너뜀)
        //count() -> 개수를 반환
        long takeDropWhile = Arrays.stream(intArr)
                .takeWhile(i -> i < 4)
                //.dropWhile(i -> i < 4)
                .peek(System.out::println)
                .count(); // count()는 자바11부터 지원, 반환타입이 long


        //sum : 정수의 총합 반환
        int intSum = IntStream.rangeClosed(0, 100)
                //.filter(i -> i % 2 == 0)
                .sum();

        double doubleSum = DoubleStream.iterate(3.14, i -> i * 2)
                .limit(10)
                .peek(System.out::println)
                .sum();

        //reduce : 주어진 BiFunction으로 값을 접어나감
        //seed 값이 없을 때 : Optional 반환 (빈 스트림일 수 있으므로)
        int intReduce = IntStream.rangeClosed(1, 5)
                .reduce((prev, cur) -> {
                    System.out.printf("prev: %d, cur: %d\n", prev, cur);
                    return prev * cur;
                })
                .getAsInt();

        int intReduceWithSeed = IntStream.rangeClosed(1, 5)
                .reduce(2, (prev, cur) -> prev * cur);

        Stringstat stringStat = "Hello Wolrd! Bye World !"
                .chars()
                .boxed()
                .reduce(new Stringstat(), (ss, i) -> {
                    ss.length++;
                    if(65 <= i && i <= 90) {
                        ss.upperCases++;
                    } else if(97 <= i && i <= 122) {
                        ss.lowerCases++;
                    } else {
                        ss.nonLetters++;
                    }
                    return ss;
                }, (ss1, ss2) -> ss1);
    }

    public static class Stringstat {
        int length = 0;
        int upperCases = 0;
        int lowerCases = 0;
        int nonLetters = 0;
    }
}
