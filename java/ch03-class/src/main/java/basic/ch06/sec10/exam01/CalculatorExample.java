package basic.ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {

        Calculator cal1 = new Calculator();
        cal1.z = 10;
        System.out.println(cal1.z);
//        cal1.PI = 15;

        Calculator cal2 = new Calculator();
        cal2.z = 20;
        System.out.println(cal2.z);

        System.out.println("cal2.PI : " + cal2.PI);

        double result1 = 10 * 10 * Calculator.PI;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}