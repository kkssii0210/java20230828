package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java","css","spring");
        Stream<String>stream = list.stream();

        stream.count();

        Stream<String>stream2 = list.stream();
        stream2.count();
    }
}
