package ch15collection.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(300);
        queue.offer(500);

        Integer item1 = queue.poll();
        Integer item2 = queue.poll();
        Integer item3 = queue.poll();

        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
        System.out.println("item3 = " + item3);
    }
}
