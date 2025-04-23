package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // "DEF"
                .insert(0, "ABC") // "0번째에 ABC 추가 -> ABCDEF"
                .delete(3, 4) // "3번째부터 4번째까지 삭제 -> ABCEF"
                .toString(); // "문자열로 변환"
        System.out.println(data);
    }
// 실행결과 ABCEF
}
