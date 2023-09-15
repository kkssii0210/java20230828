package ch17stream.lecture;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class C20primitive {
    public static void main(String[] args) {
        // 기본 타입 stream : IntStream LongStream DoubleStream
        // 참조 타입 stream : Stream<T>
        // 기본을 참조로
        Integer max = IntStream.of(3, 9, 1, 2, 7)
                .boxed()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("max = " + max);
    }
}
