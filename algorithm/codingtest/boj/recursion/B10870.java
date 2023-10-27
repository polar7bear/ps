package algorithm.codingtest.boj.recursion;

public class B10870 {
    //피보나치 수 5
    public static int recursion(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;

        return recursion(n - 1) + recursion(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
}
