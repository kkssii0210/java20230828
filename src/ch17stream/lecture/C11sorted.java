package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,1,8,5,7,9);

        list.stream()
                .sorted((x,y)->x-y)
                .forEach(System.out::println);
        list.stream()
                .filter(e->e%2==0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);
        System.out.println("-----------------");
        list.stream()
                .filter(e->e%2==1)
                .sorted()
                .skip(list.size()-3)
                .forEach(System.out::println);
        var list1 = List.of("신라면","java","JAVA","dsfasfd123");
        list1.stream()
                .filter(n->n.startsWith("j")||n.startsWith("J"))
                .forEach(System.out::println);

    }
}
