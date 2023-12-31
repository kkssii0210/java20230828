package ch17stream.lecture;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class C04lazy {
    public static void main(String[] args) {
        List<String>list = List.of("a","b","c");
        Stream<String> stream = list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println("중간연산실행중");
                return false;
            }
        })
                .count();
    }
}
