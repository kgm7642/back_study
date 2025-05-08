package basic.ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = { "홍길동", "신용권", "김미나"};
        int[] intArray = { 1, 2, 3, 4, 5 };

        Stream<String> stringStream = Arrays.stream(strArray).sorted();
        stringStream.forEach(item -> System.out.print(item+","));

        System.out.println();

        IntStream integerStream = Arrays.stream(intArray);
        integerStream.forEach(item -> System.out.print(item+","));
    }
}