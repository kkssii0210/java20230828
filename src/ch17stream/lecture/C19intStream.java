package ch17stream.lecture;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33);
        var stats = intStream.summaryStatistics();
        //최대값
        //최소값
        //평균값
        System.out.println("average = " + stats.getAverage()+" max = "+stats.getMax()+" min = "+stats.getMin());
        stats.accept(99);
        System.out.println("stats.getMax() = " + stats.getMax());
    }
}
