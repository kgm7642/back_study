package advanced;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = 0;
        while(true) {

            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택");
            int n = sc.nextInt();
            if(n==1) {
                System.out.print("예금액 ");
                int m = sc.nextInt();
                System.out.println("예금액 "+(amount += m));
            } else if(n==2) {
                System.out.print("출금액 ");
                int m = sc.nextInt();
                System.out.println("출금액"+(amount -= m));
            }
            else if(n==3) System.out.println("잔고"+amount);
            else if(n==4) break;
            else System.out.println("잘못 입력했습니다.");
        }
        System.out.println("프로그램 종료");
    }
}
