package advanced.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(new Board());
        }
        System.out.println(list.size()+"개");
        System.out.println(list.get(2));
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(2);
        for(Board board : list) {
            System.out.println(board);
        }
    }
}
