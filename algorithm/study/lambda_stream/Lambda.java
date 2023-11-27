package algorithm.study.lambda_stream;

public class Lambda {
    public static void main(String[] args) {
        Multi multi = (a, b) -> a * b;

        Multi multi2 = (a, b) -> {
            System.out.println("여러줄 람다식");
            System.out.printf("%d x %d = %d\n", a, b, a*b);
            return a * b;
        };

        System.out.println(multi.multi(3, 5));
        System.out.println(multi2.multi(5, 5));
    }
}
