package ch06Class;

public class C01class {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        System.out.println("Hashcode = " +System.identityHashCode(o1));
        System.out.println("o1.age = " + o1.age);
        o1.age = 30;

        System.out.println("o1.age = " + o1.age);
        MyClass01 o2 = o1;
        System.out.println("o2.age = " + o2.age);
    }
}
class MyClass01 {
    int age;
    String name;

}