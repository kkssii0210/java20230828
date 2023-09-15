package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
        List<String> list = List.of("jasd","html","ass","spridg");

        List<Integer> res1 = new ArrayList<>();
        for (String s : list) {
            res1.add(s.hashCode());
        }
        System.out.println("res1 = " + res1);

        List<Integer> res2 = list.stream()
                .map(String::hashCode)
                .collect(Collectors.toList());
        System.out.println("res2 = " + res2);

        Set<Integer> res3 = list.stream()
                .map(String::hashCode)
                .collect(Collectors.toSet());
        System.out.println("res3 = " + res3);
    }
}
