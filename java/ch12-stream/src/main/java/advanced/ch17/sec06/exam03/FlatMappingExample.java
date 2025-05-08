package advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList< >();
        list1.add("this is java");
        list1.add("i am a best developer");
        //문장 스트림을 단어 스트림으로 변환 후 출력
        list1.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(item -> System.out.println(item));

        System.out.println();

        //문자열 숫자 목록 스트림을 숫자 스트림으로 변환 후 출력
        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .map(s -> s.trim())
                .map(s -> Integer.parseInt(s))
                .forEach(item -> System.out.println(item));
    }
}
