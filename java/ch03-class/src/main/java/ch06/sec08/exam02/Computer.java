package ch06.sec08.exam02;

public class Computer {

    int sum(int a, int b, int c) {
        return a+b+c;
    }

    int sum(int a, int b, int c, int d, int f) {
        return a+b+c+d+f;
    }

    int sum(int[] arr) {
        int sum = 0;
        for(int el : arr) {
            sum += el;
        }
        return sum;
    }
}
