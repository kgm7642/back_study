package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("입력 문자열: ");
            String str = sc.nextLine();

            if(str.equals("q")) {
                break;
            }
            System.out.print("출력 문자열: " + str);
            System.out.println();
        }
        // 스캐너 닫기
        System.out.println("종료");
        sc.close();
    }
}
