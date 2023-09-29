import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int charge = 0;
        int price = 5;
        int money = 10;
        int count = 2;

        for(int i = 1; i <= count; i++) charge += price * i;
        if(money > charge) System.out.println(0);

        System.out.println(charge - money);
    }
}

