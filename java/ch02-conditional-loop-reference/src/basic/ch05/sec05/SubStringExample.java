package basic.ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        /*
        * 인자가 1개일때
        * - 해당 index값에서 끝까지
        *
        * 인자가 2개일때 (시작index, 끝index)
        * - 시작index부터 끝index까지를 반환 (끝 index에 해당하는 값은 반환 X)
        * */

//        String firstNum = ssn.substring(0,6);
//        System.out.println(firstNum);
//        String secondNum = ssn.substring(7,14);
//        System.out.println(secondNum);

        /*
        * split
        * 문자열을 특정 구분자를 기준으로 잘라서 문자열 배열로 반환
        * */
        String[] tokens = ssn.split("-");
        System.out.println(tokens[1]);
        System.out.println(tokens[0]);
    }
}
