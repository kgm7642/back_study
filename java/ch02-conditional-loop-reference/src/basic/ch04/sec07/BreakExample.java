package basic.ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = 0;
        do {
            num = rand.nextInt(6) + 1;
            System.out.println(num);
        } while(num!=6);
        System.out.println("프로그램 종료");
    }
}
