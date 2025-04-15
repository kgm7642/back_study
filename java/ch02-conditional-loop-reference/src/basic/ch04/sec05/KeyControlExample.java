package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int speed = 0;
        while(n != 3) {
            System.out.println("-------------------------");
            System.out.println("1, 중속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.print("선택: ");
            n = sc.nextInt();
            if(n == 1) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if(n==2) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            }
        }


    }
}
