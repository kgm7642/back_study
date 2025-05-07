package model;

public class BookDTO {
    // 필드
    private String bNo;       // 도서 번호
    private int category;     // 도서분류코드
    private String title;     // 도서 제목
    private String author;    // 도서 저자

    // 생성자
    // 1. 기본 생성자
    public BookDTO() {
    }

    // 2. bNo, category, title, author를 초기화하는 생성자
    public BookDTO(String bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    // getter/setter 메소드
    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // toString() 메소드
    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo='" + bNo + '\'' +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    // lombok 사용해도 OK
}
