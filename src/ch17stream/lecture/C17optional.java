package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C17optional {
    public static void main(String[] args) {
        List<Integer> list = List.of();
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);

//        Integer value = sum.get();
//        System.out.println("value = " + value);

        System.out.println("sum.orElse(0) = " + sum.orElse(0));

    }
}
