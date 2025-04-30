package lecture.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map
        * -> Collection 인터페이스들과는 다른 저장방식
        * key, value 쌍으로 저장하는 방식
        *
        * key란?
        * - 값을 찾기 위한 이름 역할의 객체
        * - 키는 중복을 허용하지 않음, 키가 다르면 중복되는 값은 저장 가능
        * */

        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("1", "java8");
        hmap.put("2", "oracle");
        hmap.put("3", "jdbc");
        hmap.put("4", "html5");
        hmap.put("5", "css3");
//        hmap.put("5", "css3"); // 키는 중복저장되지 않고 최근 키의 value로 덮어씌워짐
        System.out.println("hmap : " + hmap);

        // 삭제
        hmap.remove("1");
        System.out.println("hmap : " + hmap);

        // getOrDefault(key, DefaultValue)
        // 지정한 키가 맵에 없을때 기본값을 반환, 있을때는 해당키의 value을 반환
        System.out.println("getOrDefault 테스트 : " + hmap.getOrDefault("2", "기본값"));

        /* Iterator로 key value 출력 */
        System.out.println("================= Set을 이용해 Iterator 로 변환 =================");

        // keySet() : map에 저장된 모든 key를 Set형태로 반환
        Set<String> keys = hmap.keySet();

        // iterator() -> iterator 객체 반환
        Iterator<String> keyIter = keys.iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();

            // key값으로 value 꺼냄
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("================= Set을 이용해 forEach 로 변환 =================");
        for(String key : keys) {
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("================= Map 내부의 EntrySet 이용 =================");
        // entrySet() : Map에 저장된 key와 value 쌍을 Set형태로 "뷰"로 반환
        // -> 이때 반환된 Set은 Map이랑 연결되어있어서 추가수정삭제를하면 원본에도 반영
        // Set<Map.Entry<K, V>> set = map.entrySet()
        Set<Map.Entry<String, String>> set = hmap.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
