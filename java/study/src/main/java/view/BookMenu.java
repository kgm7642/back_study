package view;

import controller.BookManager;
import model.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        // 메뉴 출력
        /*
        *** 도서 관리 프로그램 ***
        1. 새 도서 추가
        2. 도서 삭제
        3. 도서 검색출력
        4. 전체 출력
        5. 끝내기
        */
        // 메뉴 번호 입력 받기
        // 잘못된 입력 처리
        // 각 메뉴에 따른 기능 실행
        while(true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색출력");
            System.out.println("4. 전체 출력");
            System.out.println("5. 끝내기");
            System.out.print("메뉴 선택 : ");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("삭제할 도서의 인덱스를 입력해 주세요 : ");
                    bm.deleteBook(Integer.parseInt(sc.nextLine()));
                    break;
                case 3:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 4:
                    bm.displayAll();
                    break;
                case 5:
                    System.out.print("y/n : ");
                    String answer = sc.nextLine();
                    if(answer.equalsIgnoreCase("Y")) return;
                    else break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
            } // switch문
        } // while문
    }

    public BookDTO inputBook() {
        // 도서 번호 : 입력받음
        // 도서 제목 : 입력 받음
        // 도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : 입력 받음 (숫자로)
        // 도서 저자 : 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴
        System.out.print("도서 번호 : ");
        String bNo = sc.nextLine();
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = Integer.parseInt(sc.nextLine());
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();
        return new BookDTO(bNo,category, title, author);
    }

    public String inputBookTitle() {
        // "도서 제목 : " 입력 받아 리턴
        System.out.print("확인할 도서명을 입력해주세요 : ");
        return sc.nextLine();
    }
}
