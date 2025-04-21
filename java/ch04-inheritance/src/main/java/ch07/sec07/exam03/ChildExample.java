package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // 타입이 Parent라 field2 접근 불가능
//        parent.field2 = "data2";
        // 타입이 Parent라 method3()을 호출할 수 없음
//        parent.method3();
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
