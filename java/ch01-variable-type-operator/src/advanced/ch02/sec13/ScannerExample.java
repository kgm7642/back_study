package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
        while(true) {
            System.out.println("x 값 입력 : ");
            String str = sc.nextLine();

            if(str.equals("q")) {
                break;
            }
            System.out.println("입력값 = " + str);
        }
        // 스캐너 닫기
        System.out.println("종료");
        sc.close();
    }
}
