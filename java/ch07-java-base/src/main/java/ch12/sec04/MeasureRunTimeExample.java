package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        int sum = 0;
        long time1 = System.nanoTime();
        for(int i=1; i<1000000; i++) {
            sum+=i;
        }
        long time2 = System.nanoTime();
        System.out.println("1부터 1000000까지의 합 : " + sum);
        System.out.println("소요된 시간 : " + (time2-time1) + "나노초");
    }
}
