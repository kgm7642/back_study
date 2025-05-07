package controller;

import model.BookDTO;
import view.BookMenu;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;  // 도서 목록

    public BookManager() {
        // bookList 인스턴스 생성
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        // 도서 추가
        this.bookList.add(book);
    }

    public void deleteBook(int index) {
        // 전달받은 index로 도서 삭제
        if(0 <= index && index < this.bookList.size()) {
            this.bookList.remove(index);
        } else {
            throw new IndexOutOfBoundsException("유효하지 않은 인덱스입니다. : " + index);
        }
    }

    public int searchBook(String title) {
        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        // 도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        for(int i=0; i<bookList.size(); i++) {
            if(bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        //인덱스 위치의 객체의 정보를 출력함
        // 인덱스 도서가 없으면 적절한 메시지 출력
        if(0 <= index && index < this.bookList.size()) {
            System.out.println(bookList.get(index).toString());
        } else {
            throw new IndexOutOfBoundsException("유효하지 않은 인덱스입니다. : " + index);
        }

    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        // 도서가 없는 경우 적절한 메시지 출력
        if(bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for(BookDTO book : bookList) {
                System.out.println(book.toString());
            }
        }
    }
}
