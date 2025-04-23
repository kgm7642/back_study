package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별: ");
        char gender = sc.nextLine().charAt(0);
        lm.insertMember(new Member(name, age, gender));

        // ==== 메뉴 ==== 무한 반복 실행
        while(true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print("메뉴 선택: ");
            int select = Integer.parseInt(sc.nextLine());
            if(select == 1) {
                lm.myInfo();
            } else if(select == 2) {
                selectAll();
            } else if(select == 3) {
                searchBook();
            } else if(select == 4) {
                rentBook();
            } else if(select == 0) {
                break;
            } else {
                System.out.println("숫자를 정확하게 입력해주세요.");
            }
        }
        System.out.println("프로그램 종료");
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for(int i=0; i<bList.length; i++) {
            System.out.println(i + "번 도서: " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드: ");
        Book[] searchList = lm.searchBook(sc.nextLine());
        if(searchList.length==0) System.out.println("검색 결과가 없습니다.");
        for(Book book : searchList) {
            if(book instanceof AniBook) {
                AniBook aniBook = (AniBook) book;
                System.out.println(aniBook.getTitle()+" // "+aniBook.getAuthor()+" // "+aniBook.getAuthor()+ " // "+aniBook.getAccessAge());
            } else if(book instanceof CookBook) {
                CookBook cookBook = (CookBook) book;
                System.out.println(cookBook.getTitle()+" // "+cookBook.getAuthor()+" // "+cookBook.getAuthor()+ " // "+cookBook.isCoupon());
            }
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택: " );
        int result = lm.rentBook(Integer.parseInt(sc.nextLine()));
        if(result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if(result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if(result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        } else {
            System.out.println("번호를 정확하게 누르세요.");
        }
    }

    public LibraryManager getLm() {
        return lm;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
