package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book {
    private int accessAge;

    public AniBook() {}
    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public String toString() {
        return super.toString()+" 제한 나이: "+this.accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
