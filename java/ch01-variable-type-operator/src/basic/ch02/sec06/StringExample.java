package basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // 이스케이프 문

        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name);
        System.out.println(job);

        // \" : 큰따옴표 표시
        // \' : 작은따옴표 표시
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        // \t : 탭
        str = "번호\t\t\t이름\t\t\t직업";
        System.out.println(str);

        // \n : 줄바꿈
        str = "나는\n자바를\n배웁니다. ";
        System.out.println(str);
    }
}
