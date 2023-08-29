package ch06Class;

public class C04array {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        System.out.println(System.identityHashCode(o1));
        o1.age = 30;
        System.out.println("o1.age = " + o1.age);
        MyClass05 o2 = new MyClass05();
        System.out.println("o2.age = " + o2.age);
        o1.model = "java";
        MyClass05.model="spring";
        System.out.println("o2.model= " + o2.model);

    }


}


class MyClass05{
    int age;
    static String model;
}