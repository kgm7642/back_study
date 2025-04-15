package basic.ch04.sec02;

import java.util.Random;

public class IfNestedExample {
    public static void main(String[] args) {
        Random rand = new Random();
        // bound준 값의 미만
        int score = rand.nextInt(20) + 81;
        System.out.println("점수: " + score);
        String grade;
        if(score >= 95) {
            grade = "A+";
        } else if(score >= 90) {
            grade = "A";
        } else if(score >= 85) {
            grade = "B+";
        } else {
            grade = "B";
        }
        System.out.println("학점: " + grade);
    }
}
