package advanced;

public class Example05 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = 0;
        for(int el : array) {
            if(el>max) max = el;
        }
        System.out.println(max);
    }
}
