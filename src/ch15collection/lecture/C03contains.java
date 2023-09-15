package ch15collection.lecture;

import java.util.*;

public class C03contains {
    public static void main(String[] args) {
        List<String > list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("spring"));

        boolean c1 = list1.contains(new String("java"));
        System.out.println(c1);

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains(new MyClass03("흥민"));
        System.out.println(c2);

    }
}

class MyClass03 {
    private String name;

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass03 myClass03 = (MyClass03) o;
        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}