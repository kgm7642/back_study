package basic.ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        do {
            str = sc.nextLine();
            if(str.equals("안녕하세요")) System.out.println("안녕하세요");
            if(str.equals("반갑습니다")) System.out.println("반갑습니다");

        } while (!str.equals("q"));
        System.out.println("프로그램 종료");
    }
}
