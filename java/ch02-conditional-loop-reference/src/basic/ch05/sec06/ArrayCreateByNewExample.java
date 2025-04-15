package basic.ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for(int el : arr1) {
            System.out.println(el);
        }
        String[] arr2 = new String[3];
        for(String el : arr2) {
            System.out.println(el);
        }
    }
}
