package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C17unmodifiable {
    public static void main(String[] args) {
        //수정불가 set
        Set<String> set = Set.of("spring","java","css");
        //수정불가 map
        Map<String, String >map = Map.of("num1","hm","num2","ki","num3","mj");

    }
}
