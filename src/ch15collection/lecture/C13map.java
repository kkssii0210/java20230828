package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String, String> map = new HashMap<>();
        map.put("player1","손흥민");
        map.put("player2","이강인");
        map.put("player3","김민재");


        //향상된 for문
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
        //keySet
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
        //forEach
        map.forEach((key,value)-> System.out.println(key + ":" + value));

    }
}
