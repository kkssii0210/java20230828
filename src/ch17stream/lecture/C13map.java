package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        var list = List.of(3,1,2,5,7);

        list.stream()
                .map(x->10)
                .forEach(System.out::println);
    }
}
