package ch06Class;

public class C06method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        o1.myMethod1();
        MyClass07 o2 = new MyClass07();
        o2.myMethod1();
        o1.name = "java";
        o2.name = "spring";
        o1.printName();
        o2.printName();

    }
}

class MyClass07 {
    String name;

    void printName() {
        System.out.println("name = " + name);
    }

    void myMethod1() {
        System.out.println("myMethod1 실행됨");
        System.out.println("MyClass07.myMethod1"); //soutm

    }
}