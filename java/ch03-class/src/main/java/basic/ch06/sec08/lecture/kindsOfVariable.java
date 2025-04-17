package basic.ch06.sec08.lecture;

public class kindsOfVariable {

    /*
    * 클래스 영역에 작성하는 변수를 필드
    * 필드 == 멤버변수 == 전역변수(클래스 전역에서 사용가능한 변수)
    * */

    // 인스턴스 변수 : non-static 필드를 의미
    // -> 인스턴스 생성 시점에 사용 가능한 변수라는 의미
    private int globalNum;

    // 정적 필드 == 클래스 변수 : static 필드를 의미
    private int staticNum;

    public void testMethod(int 매개변수) {

        /*
        * 지역변수 : 메소드 영역에서 작성하는 변수
        * -> 매개변수도 일종의 지역변수
        * */

        int local;
    }


}
