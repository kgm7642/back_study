package ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("c:/temp/file1.txt");
        if(file.exists()) {
            if(file.isFile()) {
                System.out.println("파일 경로 : " + file.getAbsolutePath() + "\n파일 크기 : " + file.length() + "바이트");
            } else if(file.isDirectory()){
                System.out.println("<dir> " + file.getAbsolutePath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}
