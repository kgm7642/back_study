package basic.ch04.sec03;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        Random rand = new Random();
        // bound준 값의 미만
        int num = rand.nextInt(6) + 1;

        switch (num) {
            case 1:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 2:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 3:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 4:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 5:
                System.out.println(num+"번이 나왔습니다.");
                break;
            default:
                System.out.println(num+"번이 나왔습니다.");
                break;


        }

    }
}
