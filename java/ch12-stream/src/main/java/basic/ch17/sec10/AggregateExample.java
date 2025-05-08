package basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //2의 배수 카운팅
        IntStream stream1 = Arrays.stream(arr);
        int count = (int) stream1.filter(i->i%2==0).count();
        System.out.println("2의 배수 개수: " + count);

        //2의 배수 총합
        IntStream stream2 = Arrays.stream(arr);
        int sum = stream2.filter(i->i%2==0).sum();
        System.out.println("2의 배수의 합: " + sum);

        //2의 배수 평균
        IntStream stream3 = Arrays.stream(arr);
        OptionalDouble avg = stream3.filter(i->i%2==0).average();
        System.out.println("2의 배수의 평균: " + avg.getAsDouble());

        //2의 배수 중 최대값
        IntStream stream4 = Arrays.stream(arr);
        OptionalInt max = stream4.filter(i->i%2==0).max();
        System.out.println("최대값: " + max.getAsInt());

        //2의 배수 중 최소값
        IntStream stream5 = Arrays.stream(arr);
        OptionalInt min = stream5.filter(i->i%2==0).min();
        System.out.println("최소값: " + min.getAsInt());

        //첫 번째 3의 배수
        IntStream stream6 = Arrays.stream(arr);
        OptionalInt first = stream6.filter(n -> n%3==0).findFirst();
        System.out.println("첫 번째 3의 배수: " + first.getAsInt());

    }
}
