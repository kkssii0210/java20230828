package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("react");

        int size = list.size();
        System.out.println(size);

    }

}
