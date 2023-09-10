public class Main {
    public static void main(String[] args) {
        long n = 121;
        long answer = (long) Math.sqrt(n);

        if(n == Math.pow(answer, 2)) {  //answer * answer
            answer = (long) Math.pow(answer+1, 2);
        } else {
            answer = -1;
        }

        System.out.println(answer);
    }
}
