package ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        var list = List.of(5,1,3);
        Integer reduce = list.stream()
                .reduce(0, (r, e) -> 0);
        System.out.println("reduce = " + reduce);

        Integer reduce1 = list.stream()
                .reduce(0, (r, e) -> r + e);
        System.out.println(reduce1);

        System.out.println("최대값 구하기");
        Integer reduce2 = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("reduce1 = " + reduce2);
        Integer reduce3 = list.stream()
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("reduce1 = " + reduce3);

        var list2 = List.of("ja","va","is","g","ood");
        String reduce4 = list2.stream()
                .reduce("", String::concat); //(r,s)->r+s도 가능
        System.out.println("reduce4 = " + reduce4);


    }
}
