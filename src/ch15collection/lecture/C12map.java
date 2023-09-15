package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //엔트리 추가 메소드 put.
        map.put("student1","손흥민");
        map.put("student2","이강인");
        map.put("student3","김민재");
        //엔트리 갯수 확인 size.
        System.out.println("map.size() = " + map.size());
        //엔트리 교체도 put.
        map.put("student3","박지성");
        //엔트리 삭제 remove
        map.remove("student3");
        //엔트리의 value를 가져오는 메서드 get
        String str = map.get("student1");
        System.out.println("map.get(\"student3\") = " + str);


    }
}
