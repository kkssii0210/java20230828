package ch17stream.lecture;

import java.util.List;

public class C21reference {
    public static void main(String[] args) {
        List<String> list1 = List.of("java","spring","css");
        Integer length = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();
        System.out.println("length = " + length);
        //참초타입 스트림 -> 기본타입 스트림
        int sum = list1.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);
    }
}
