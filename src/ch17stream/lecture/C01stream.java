package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {
    public static void main(String[] args) {
        List<String> list = List.of("java","spring","css","react");

        for (String item : list){
            System.out.println("item = " + item);
        }

        Stream<String> stream = list.stream();
        //메소드
        //중간연산 : 중간에 여러번
        //최종연산 : 마지막 한번만 가능
        stream.limit(5);
        stream.count();  //최종연산

    }
}
