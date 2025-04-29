package advanced.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(new Board("과목"+i, "제목"+i, "작가"+i));
        }
        System.out.println("============================");
        System.out.println("ArrayList에 저장된 요소의 개수 출력 : "+list.size()+"개");
        System.out.println("============================");
        System.out.println("3번째 데이터를 추출하여 출력"+list.get(2));
        System.out.println("============================");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
        list.remove(2);
        System.out.println("============================");
        for(Board board : list) {
            System.out.println(board);
        }
    }
}
