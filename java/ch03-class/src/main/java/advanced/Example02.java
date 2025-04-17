package advanced;

public class Example02 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println();
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.print("---------------------------");
        /*
         *****
         ****
         ***
         **
         *
        */
        for(int i=0; i<5; i++) {
            System.out.println();
            for(int j=i; j<5; j++) {
                System.out.print("*");
            }
        }
    }
}
