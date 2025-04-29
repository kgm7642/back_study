package advanced.ch15.sec02.exam03;

import advanced.ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();
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
